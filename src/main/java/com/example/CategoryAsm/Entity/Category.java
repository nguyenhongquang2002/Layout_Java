package com.example.CategoryAsm.Entity;

import com.example.CategoryAsm.Entity.StatusEnum.CategoryStatus;
import com.example.CategoryAsm.Entity.base.BaseEntity;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private CategoryStatus status;


    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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
}
