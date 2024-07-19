package mvc.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController{
    @GetMapping(value = "/home")
    public String home(Model page) {
        page.addAttribute("username", "Denis");
        page.addAttribute("color", "red");
        page.addAttribute("yourStr", "У меня БОЛЬШОЙ секрет");
        page.addAttribute("size", "5em");
        return "home.html";
    }
}