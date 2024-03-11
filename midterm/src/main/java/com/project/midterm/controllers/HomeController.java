package com.project.midterm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
   
    @GetMapping("/")
    public String index() {
        System.out.println("Hello from HomeController");
        return "index";
    }

    @GetMapping("/ping")
    public String ping() {
        System.out.println("pong");
        return "pong";
    }
}
