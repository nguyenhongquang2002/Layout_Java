package com.example.CategoryAsm.Model;

import com.example.CategoryAsm.Entity.Product;

import java.util.List;

public interface ProductModel {
    boolean save(Product product);
    boolean update(int id ,Product product);
    boolean delete(int id);
    List<Product> findByAll();
    Product findById(int id);
}
