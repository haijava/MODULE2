package com.hai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SanwidController {
    @GetMapping("/")
    public String show(){
        return "show";
    }
    @PostMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model){
        List<String> list = new ArrayList<>();
        for (String check:condiment){
            list.add(check);
        }
        model.addAttribute("result", list.toString());
        return "saves";
    }

}
