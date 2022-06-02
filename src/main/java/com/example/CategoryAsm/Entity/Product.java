package com.example.CategoryAsm.Entity;

import com.example.CategoryAsm.Entity.base.BaseEntity;

public class Product extends BaseEntity {
    private int id;
    private String name;
    private String desciption;
    private String detail;
    private double price;

    public Product(int id, String name, String desciption, String detail, double price) {
        this.id = id;
        this.name = name;
        this.desciption = desciption;
        this.detail = detail;
        this.price = price;
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

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
