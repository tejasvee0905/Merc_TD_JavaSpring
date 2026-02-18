package com.example.service;


import com.example.model.Laptop1;
import com.example.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository lr;
    public void addLaptop(@RequestBody Laptop1 lp) {
        lr.save(lp);
    }
    public List<Laptop1> listLaptop() {
        return lr.findAll();
    }
    public Optional<Laptop1> findOnelaptop(@PathVariable int index) {
        return lr.findById(index);
    }

    public Laptop1 updateLaptop(@PathVariable int index, @RequestBody Laptop1 newLaptop) {
        Optional<Laptop1> oldLaptop = lr.findById(index);
        oldLaptop.get().setBrand(newLaptop.getBrand());
        oldLaptop.get().setPrice(newLaptop.getPrice());
        oldLaptop.get().setRAM(newLaptop.getRAM());
        lr.save(oldLaptop.get());
        return oldLaptop.get();
    }

    public void deleteLaptop(@PathVariable int index) {
        lr.deleteById(index);
    }

    public List<Laptop1> findByBrand(@PathVariable String brand) {
        return lr.findByBrand(brand);
    }
}