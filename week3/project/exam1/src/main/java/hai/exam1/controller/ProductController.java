package hai.exam1.controller;

import hai.exam1.model.Category;
import hai.exam1.model.Product;
import hai.exam1.model.ProductUpload;
import hai.exam1.service.CategoryService;
import hai.exam1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("category")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        Object target = dataBinder.getTarget();
        if (target == null) {
            return;
        }
        System.out.println("Target=" + target);
        if (target.getClass() == ProductUpload.class) {
            dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
        }
    }

    @GetMapping("/")
    public ModelAndView showIndex() {
        Iterable<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("/product/index");
        modelAndView.addObject("products", products);
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }
    @GetMapping("/product")
    public ModelAndView cartIndex() {
        Iterable<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("/login/index");
        modelAndView.addObject("products", products);
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @GetMapping("/admin")
    public ModelAndView showadmin() {
        Iterable<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("/admin/admin");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/categories/{categoryId}")
    public ModelAndView showlistProduct(@PathVariable("categoryId") Long categoryId) {
        Iterable<Product> products = productService.findByCategory(categoryService.findId(categoryId));
        ModelAndView modelAndView = new ModelAndView("/product/categories");
        modelAndView.addObject("products", products);
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;

    }

    @GetMapping("create-product")
    public ModelAndView showFormProduct(@ModelAttribute("product") ProductUpload product) {
        ModelAndView modelAndView = new ModelAndView("/admin/create");
        modelAndView.addObject("product", new ProductUpload());
        //modelAndView.addObject("productUpload", product);
        return modelAndView;
    }

    @PostMapping("create-product")
    public ModelAndView create(HttpServletRequest request, @ModelAttribute("product") ProductUpload product) {
        Product productPersist = new Product();
        productPersist.setName(product.getName());
        productPersist.setImage(product.getImage());
        productPersist.setPrice(product.getPrice());
        productPersist.setDescription(product.getDescription());
        productPersist.setStatus(product.getStatus());
        productPersist.setCategory(product.getCategory());
        String uploadRootPath = request.getServletContext().getRealPath("images");
        System.out.println("uploadRootPath=" + uploadRootPath);
        File uploadRootDir = new File(uploadRootPath);

        String hardUploadFolder = "/home/user/Downloads/MODULE2/apache-tomcat-9.0.27/webapps/ROOT/images/";
        if (!uploadRootDir.exists()) {
            uploadRootDir.mkdirs();
        }
        CommonsMultipartFile[] fileDatas = product.getFileDatas();
        Map<File, String> uploadedFiles = new HashMap<>();
        for (CommonsMultipartFile fileData : fileDatas) {
            String name = fileData.getOriginalFilename();
            System.out.println("Client File Name = " + name);

            if (name != null && name.length() > 0) {
                try {
                    File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(fileData.getBytes());
                    stream.close();
                    product.setImage("/images/" + name);
//                    //
                    File serverHardFile = new File(hardUploadFolder + File.separator + name);
                    stream = new BufferedOutputStream(new FileOutputStream(serverHardFile));
                    stream.write(fileData.getBytes());
                    stream.close();
//                    //
                    uploadedFiles.put(serverFile, name);
                    System.out.println("Write file: " + serverFile);
                } catch (Exception e) {
                    System.out.println("Error Write file: " + name);
                }
            }
        }
        productService.save(productPersist);


        ModelAndView modelAndView = new ModelAndView("/admin/create");
        modelAndView.addObject("productUpload", new ProductUpload());
        modelAndView.addObject("message", "a new product was create");
        return modelAndView;

    }

    @GetMapping("/edit/{id}")
    public ModelAndView show(@PathVariable("id") Long id) {
        Product product = productService.findId(id);
        ModelAndView modelAndView = new ModelAndView("/admin/edit");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView edit(@ModelAttribute("product") Product product,ProductUpload productUpload) {
        product.setName(productUpload.getName());
        product.setImage(productUpload.getImage());
        product.setStatus(productUpload.getStatus());
        product.setDescription(productUpload.getDescription());
        product.setPrice(productUpload.getPrice());
        product.setCategory(productUpload.getCategory());
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/admin/edit");
        modelAndView.addObject("product", product);

        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable("id") Long id) {
        Product product = productService.findId(id);
        ModelAndView modelAndView = new ModelAndView("/admin/delete");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("product") Product product) {
        productService.delete(product.getId());

        return "redirect:/admin";
    }

}
