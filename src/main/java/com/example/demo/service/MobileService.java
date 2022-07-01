package com.example.demo.service;

import com.example.demo.entity.Mobile;
import com.example.demo.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {

    @Autowired
    private MobileRepository repository;

    public Mobile saveMobil(Mobile mobile){
        return repository.save(mobile);
    }
    public List<Mobile> getMobiles(){
        return repository.findAll();
    }

    public List<Mobile> addMobiles(List<Mobile> mobiles){
        return repository.saveAll(mobiles);
    }

    public Mobile getMobileByName(String name){
        return repository.findByName(name);
    }

    public Mobile getMobileById(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Mobile> findMobilesByName(String name){
        return repository.findAllByName(name);
    }
    public Mobile findByBrand(String brand){
        return repository.findByBrand(brand);
    }

    public String DeleteMobileById(int id){
        repository.deleteById(id);
        return "Deletion Success full";
    }

    public Mobile update(Mobile mobile){
        Mobile existingMobile=repository.findById(mobile.getId()).orElse(null);
        existingMobile.setName(mobile.getName());
        existingMobile.setColor(mobile.getColor());
        existingMobile.setBrand(mobile.getBrand());
        existingMobile.setRam(mobile.getRam());
        existingMobile.setRom(mobile.getRom());
        return repository.save(existingMobile);
    }
    public Mobile upadte1(Mobile mobile){
        repository.findById(mobile.getId()).orElse(null);
        return repository.save(mobile);
    }

}
