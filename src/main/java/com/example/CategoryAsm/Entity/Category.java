package com.example.CategoryAsm.Entity;

import com.example.CategoryAsm.Entity.StatusEnum.CategoryStatus;
import com.example.CategoryAsm.Entity.StatusEnum.ProductStatus;
import com.example.CategoryAsm.Entity.base.BaseEntity;

import java.nio.channels.FileLock;
import java.time.LocalDateTime;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private CategoryStatus status;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    public LocalDateTime deletedAt;
    public int createdBy;
    public int updatedBy;
    public int deletedBy;


    public Category(int id, String name, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, CategoryStatus status) {
    }

    public Category() {
        this.id = id;
        this.name = name;
    }

    @Override
    public FileLock getProductValidation() {
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

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

    public CategoryStatus getStatus() {
        return status;
    }

    public void setStatus(CategoryStatus status) {
        this.status = status;
    }


}
