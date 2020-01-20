package hai.exam1.controller;

import hai.exam1.model.Category;
import hai.exam1.model.CategoryUpload;
import hai.exam1.service.CategoryService;
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

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        Object target = dataBinder.getTarget();
        if(target == null) {
            return;
        }
        System.out.println("Target=" + target);
        if(target.getClass() == Category.class){
            dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
        }
    }

    @GetMapping("/lica")
    public ModelAndView list(){
        Iterable<Category>categories =categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("category",categories);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category",new CategoryUpload());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView create(HttpServletRequest request, @ModelAttribute("category") CategoryUpload category){
        String uploadRootPath = request.getServletContext().getRealPath("images");
        System.out.println("uploadRootPath=" + uploadRootPath);
        File uploadRootDir = new File(uploadRootPath);

        String hardUploadFolder= "/home/user/MODULE2/week3/excercise/exam1/src/main/webapp/images/";
        if(!uploadRootDir.exists()){
            uploadRootDir.mkdirs();
        }
        CommonsMultipartFile[] fileDatas = category.getFileDatas();
        Map<File,String> uploadedFiles = new HashMap<>();
        for (CommonsMultipartFile fileData : fileDatas) {
            String name = fileData.getOriginalFilename();
            System.out.println("Client File Name = " + name);

            if (name != null && name.length() > 0) {
                try {
                    File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(fileData.getBytes());
                    stream.close();
                    category.setImage("/images/" + name);
//                    //
                    File serverHardFile = new File( hardUploadFolder+ File.separator + name);
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
        Category cat = new Category();
        cat.setImage(category.getImage());
        cat.setName(category.getName());
        categoryService.save(cat);
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category",new Category());
        modelAndView.addObject("message","a new category was create");
        return modelAndView;
    }
}
