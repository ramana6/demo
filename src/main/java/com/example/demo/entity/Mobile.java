package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="Mobile_set")
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="colour")
    private String color;

    @Column(name="brand")
    private String brand;

    @Column(name="mobile_ram")
    private String ram;

    @Column(name="mobile_rom")
    private String rom;

    public Mobile() {
    }

    public Mobile(int id, String name, String color, String brand, String ram, String rom) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.ram = ram;
        this.rom = rom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }
}
