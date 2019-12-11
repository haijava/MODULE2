package hai.provinces.controller;

import hai.provinces.model.Province;
import hai.provinces.services.CustomerService;
import hai.provinces.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProvinceController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/province")
    public ModelAndView showLisProvince(){
        Iterable<Province>provinces=provinceService.findAll();
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces",provinces);
        return modelAndView;
    }
    @GetMapping("/create-province")
    public ModelAndView showFormCreateProvince(){
        ModelAndView modelAndView = new ModelAndView("/province/create");
        modelAndView.addObject("province", new Province());
        return modelAndView;
    }
    @PostMapping("/create-province")
    public ModelAndView createProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView modelAttribute = new ModelAndView("/province/create");
        modelAttribute.addObject("province",new Province());
        return modelAttribute;

    }
    @GetMapping("/edit-province/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id){
        Province province = provinceService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/province/edit");
        modelAndView.addObject("province",province);
        return modelAndView;
    }
    @PostMapping("/edit-province")
    public ModelAndView editProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("/province/edit");
        modelAndView.addObject("province",province);
        return modelAndView;
    }
    @GetMapping("/delete-province/{id}")
    public ModelAndView showFormDelete(@PathVariable Long id){
        Province province =provinceService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/province/delete");
        modelAndView.addObject("province",province);
        return modelAndView;
    }
    @PostMapping("/delete-province")
    public String deleteProvince(@ModelAttribute("province") Province province){
        provinceService.remove(province.getId());
        return "redirect:province";
    }

}
