package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import rikkei.academy.model.User;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String getHome(
            @ModelAttribute("user")
            User user
    ) {
        return "/login";
    }

    @PostMapping("/doLogin")
    public String login(
            @ModelAttribute("user")
            User user
    ) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("12345")) {
            return "/success";
        }
        return "/login";
    }
}
