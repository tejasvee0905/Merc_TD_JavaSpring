package com.example.controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    List<String> list = new ArrayList<>();
    public MainController() {
        list.add("Upasana");
        list.add("Virat");
        list.add("Daniel");
        list.add("Pandya");
    }

    //@RequestMapping("/list")
//    @RequestMapping(value= "/list", method= RequestMethod.GET)
    @GetMapping("/list")
    public List<String> List() {
        return list;
    }

    @PostMapping("/add")
    public void Add(@RequestBody String name) {
        //list.add("Raina");
        //list.add("Dhoni");
        list.add(name);
    }

    @PutMapping("/update")
    public void update() {
        list.set(3, "Gayle");
    }

    @DeleteMapping("/delete")
    public void delete() {
        list.remove(2);
    }

    @GetMapping("/findOne/{index}")
    public String findOne(@PathVariable int index) {
        return list.get(index);
    }

    @PutMapping("/update/{index}")
    public void update(@PathVariable int index, @RequestBody String name) {
        list.set(index,name);
    }

    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index) {
        list.remove(index);
    }
}
