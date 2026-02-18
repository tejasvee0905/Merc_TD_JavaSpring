package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebController {

    @RequestMapping("/home")
    public String home(){
        return "Home.html"; //this will render homepage
    }

    @RequestMapping("/about")
    public String aboutus(){
        return "About.html";
    }

    @RequestMapping("/players")
    public String players(){
        return "Players.html";
    }

    @RequestMapping("/matches")
    public String matches(){
        return "Matches.html";
    }
}
