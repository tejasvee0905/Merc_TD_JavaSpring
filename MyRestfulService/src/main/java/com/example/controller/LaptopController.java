package com.example.controller;

import com.example.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    List<Laptop> laptopList = new ArrayList<>();

    // Constructor - Initial Data
    public LaptopController() {
        laptopList.add(new Laptop(1, "Dell", "Inspiron", 65000));
        laptopList.add(new Laptop(2, "HP", "Pavilion", 72000));
        laptopList.add(new Laptop(3, "Lenovo", "Legion", 95000));
    }

    // 🔹 GET ALL
    @GetMapping("/lapAll")
    public List<Laptop> getAllLaptops() {
        return laptopList;
    }

    // 🔹 GET ONE
    @GetMapping("/lapAll/{id}")
    public Laptop getLaptopById(@PathVariable int id) {
        return laptopList.stream()
                .filter(laptop -> laptop.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // 🔹 ADD
    @PostMapping("/lapAdd")
    public String addLaptop(@RequestBody Laptop laptop) {
        laptopList.add(laptop);
        return "Laptop Added Successfully";
    }

    // 🔹 UPDATE
    @PutMapping("/lapUda/{id}")
    public String updateLaptop(@PathVariable int id,
                               @RequestBody Laptop updatedLaptop) {

        for (Laptop laptop : laptopList) {
            if (laptop.getId() == id) {
                laptop.setBrand(updatedLaptop.getBrand());
                laptop.setModel(updatedLaptop.getModel());
                laptop.setPrice(updatedLaptop.getPrice());
                return "Laptop Updated Successfully";
            }
        }
        return "Laptop Not Found";
    }

    // 🔹 DELETE
    @DeleteMapping("/lapDel/{id}")
    public String deleteLaptop(@PathVariable int id) {

        boolean removed = laptopList.removeIf(laptop -> laptop.getId() == id);

        if (removed) {
            return "Laptop Deleted Successfully";
        } else {
            return "Laptop Not Found";
        }
    }
}
