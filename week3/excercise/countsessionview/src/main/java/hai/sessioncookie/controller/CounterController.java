package hai.sessioncookie.controller;

import hai.sessioncookie.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("hai")
public class CounterController{
    @ModelAttribute("hai")
    public MyCounter setUpCounter(){
        return new MyCounter();
    }
    @GetMapping("/")
    public String getMyCounter(@ModelAttribute("hai") MyCounter myCounter){
        myCounter.increment();
        return "index";
    }
}