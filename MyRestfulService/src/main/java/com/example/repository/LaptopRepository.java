package com.example.repository;

import com.example.model.Laptop1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LaptopRepository extends JpaRepository<Laptop1, Integer> {

    //    @Query(value="select * from laptop l where l.brand=?1", nativeQuery = true)
//    public void findByBrand(String brand);
    //JPQL
    @Query(value = "select l from Laptop1 l where l.brand=?1")
    public List<Laptop1> findByBrand(String brand);
}
