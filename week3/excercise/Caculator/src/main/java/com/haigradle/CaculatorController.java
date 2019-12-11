package com.haigradle;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class CaculatorController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @PostMapping(value = "/new",params = "txtadd")
    public String Add(@RequestParam("txt1") int txt1, @RequestParam("txt2") int txt2, Model model) {
         int result = txt1 + txt2;
         model.addAttribute("result",result);
         return  "index";

    }
    @PostMapping(value = "/new",params = "txtmulti")
    public String Multi(@RequestParam("txt1") int txt1, @RequestParam("txt2") int txt2, Model model) {
        int result = txt1 * txt2;
        model.addAttribute("result",result);
        return  "index";

    }
    @PostMapping(value = "/new",params = "txtsub")
    public String Sub(@RequestParam("txt1") int txt1, @RequestParam("txt2") int txt2, Model model) {
        int result = txt1 - txt2;
        model.addAttribute("result",result);
        return  "index";

    }

    @PostMapping(value = "/new",params = "txtdiv")
    public String Div(@RequestParam("txt1") int txt1, @RequestParam("txt2") int txt2, Model model) {
        float result = txt1 / txt2;
        model.addAttribute("result",result);
        return  "index";

    }
}
