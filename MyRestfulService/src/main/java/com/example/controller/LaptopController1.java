package com.example.controller;

import com.example.model.Laptop1;
import com.example.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptop1")

public class LaptopController1 {
    @Autowired
    LaptopRepository lr;

    @PostMapping("/add")
    public void add(@RequestBody Laptop1 lp) {
        lr.save(lp);
    }
}