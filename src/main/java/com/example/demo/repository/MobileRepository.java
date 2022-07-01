package com.example.demo.repository;

import com.example.demo.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobileRepository extends JpaRepository<Mobile,Integer> {
    Mobile findByName(String name);

    List<Mobile> findAllByName(String name);

    Mobile findByBrand(String brand);
}
