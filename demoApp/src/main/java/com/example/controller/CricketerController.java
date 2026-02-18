package com.example.controller;

import com.example.model.Cricket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/cricket")
public class CricketerController {

    @RequestMapping("/show")
    public String home(){
        return "cricketer.html";
    }

    @RequestMapping("/showc")
    public ModelAndView showCricketer(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("cricketers");
        ModelAndView mv = new ModelAndView("cricketer");
        String name = "Tejas";
        Date dt = new Date();
        Cricket cri = new Cricket(101,11,"India");
        mv.addObject("myname", name);
        mv.addObject("mydate", dt);
        mv.addObject("mycricket", cri);
        return mv;
    }
}
