package hai.cookies.controller;

import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hai.cookies.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class LoginController {
    @ModelAttribute("user")
    public User setUpUser() {
        return new User();
    }

    @RequestMapping("/login")
    public String Index(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model) {
        Cookie cookie = new Cookie("setUser", setUser);
        model.addAttribute("cookieValue", cookie);
        return "login";
    }

    @PostMapping("/dologin")
    public String dologin(@ModelAttribute("user") User user, Model model,
                          @CookieValue(value = "setUser", defaultValue = "")
                                  String setUser, HttpServletResponse response,
                          HttpServletRequest request) {
        if (user.getEmail().equals("admin@gmail.com") && (user.getPassword().equals("12345"))) {
            if (user.getEmail() != null)
                setUser = user.getEmail();
                Cookie cookie = new Cookie("setUser", setUser);
                cookie.setMaxAge(24 * 60 * 60);
                response.addCookie(cookie);
                Cookie[] cookies = request.getCookies();
                for (Cookie ck : cookies) {
                    if (ck.getName().equals("setUser")) {
                        model.addAttribute("cookieValue", ck);
                        break;
                    } else {
                        ck.setValue("");
                        model.addAttribute("cookieValue", ck);
                        break;
                    }
                }
                model.addAttribute("message", "Login success");

            } else {
                user.setEmail("");
                Cookie cookie = new Cookie("setUser", setUser);
                model.addAttribute("cookieValue", cookie);
                model.addAttribute("message", "Login Faile Try again");
            }
        return "login";
    }
}