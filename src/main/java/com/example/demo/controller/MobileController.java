package com.example.demo.controller;

import com.example.demo.entity.Mobile;
import com.example.demo.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MobileController {

    @Autowired
    private MobileService service;

    @PostMapping("/addMobile")
    public Mobile addMobile(@RequestBody Mobile mobile){
        return service.saveMobil(mobile);
    }

    @GetMapping("/mobiles")
    public List<Mobile> findAllMobiles(){
        return service.getMobiles();
    }

    @PostMapping("/addMobiles")
    public List<Mobile> addMobiles(@RequestBody List<Mobile> mobiles){
        return service.addMobiles(mobiles);
    }

    @GetMapping("/MobileById/{id}")
    public Mobile getMobileById(@PathVariable int id){
        return service.getMobileById(id);
    }

    @GetMapping("/Mobile/{name}")
    public Mobile getMobileByName(@PathVariable String name){
        return service.getMobileByName(name);
    }

    @GetMapping("/findAll/{name}")
    public List<Mobile> findAllByName(@PathVariable String name){
        return service.findMobilesByName(name);
    }

    @GetMapping("/findByBrand/{brand}")
    public Mobile findByBrand(@PathVariable String brand){
        return service.findByBrand(brand);
    }

    @DeleteMapping("/delById/{id}")
    public String DelById(@PathVariable int id){
        return service.DeleteMobileById(id);
    }

    @PutMapping("update")
    public Mobile update(@RequestBody Mobile mobile){
        return service.update(mobile);
    }

    @PutMapping("update1")
    public Mobile update1(@RequestBody Mobile mobile){
        return service.upadte1(mobile);
    }
}
