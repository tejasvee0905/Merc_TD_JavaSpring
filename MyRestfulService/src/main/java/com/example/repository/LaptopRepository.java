package com.example.repository;

import com.example.model.Laptop1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop1, Integer> {
}
