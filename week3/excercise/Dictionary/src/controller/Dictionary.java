package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.HashMap;


@Controller
public class Dictionary {
    /*static final {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("name", "ten");
    }*/

   @GetMapping("/input")
    public  String dicString(){
        return "dic1";

    }
        @PostMapping("/diction" )
        public String dictions(@RequestParam String txtname, Model model){
            HashMap<String,String> dictionary = new HashMap<>();
            dictionary.put("hello","xin chao");
            dictionary.put("name","ten");

            model.addAttribute("dictionary",dictionary.get(txtname));

            return "dic1";

        }






}
