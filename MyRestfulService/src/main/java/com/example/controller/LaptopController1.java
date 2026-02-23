package com.example.controller;
import com.example.exception.ResourceNotFoundException;
import com.example.model.Laptop1;
import com.example.repository.LaptopRepository;
import com.example.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController // it exposes data and service in the form of JSON/XML
@RequestMapping("/laptop1")
public class LaptopController1 {
    @Autowired
    LaptopService lr;
    @PostMapping("/add")
    public void add(@RequestBody Laptop1 lp)
    {        //list.add("Surya");
        lr.addlaptop(lp);
    }
    @GetMapping("/list")
    public List<Laptop1> list()
    {
        return lr.listLaptop();
    }
    @GetMapping("/findOne/{index}")
    public ResponseEntity<Laptop1> findOne(@PathVariable int index)
    {
        Laptop1 lt=lr.findOneLaptop(index).orElseThrow(()->new ResourceNotFoundException("Laptop id not found="+index));
        return ResponseEntity.ok().body(lt);
    }
    @PutMapping("/update/{index}")
    public ResponseEntity<Laptop1> update(@PathVariable int index,@RequestBody Laptop1 newLaptop)
    {
        Laptop1 oldLaptop=lr.findOneLaptop(index).orElseThrow(()->new ResourceNotFoundException("Laptop id not found="+index));
        lr.updateLaptop(index,newLaptop);
        return ResponseEntity.ok().body(oldLaptop);
    }
    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index)
    {

        lr.deleteLaptop(index);
    }
    @GetMapping("/findByBrand/{brand}")
    public List<Laptop1> findByBrandName(@PathVariable String brand)
    {
        return lr.findByBrand(brand);
    }
}