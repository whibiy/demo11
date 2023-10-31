package com.example.demo11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("main","메인페이지");
        return "main";
    }

}
