package com.example.CategoryAsm.Model;

import com.example.CategoryAsm.Entity.Category;

import java.util.List;

public interface CategoryModel {
    boolean save(Category category);
    boolean update(int id ,Category category);
    boolean delete(int id);
    List<Category> findByAll();
    static Category findById(int id);
}
