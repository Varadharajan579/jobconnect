package com.jobconnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage(Model model) {
        // You can pass user data or welcome message here
        return "home";  // Looks for home.html inside templates folder
    }
}
