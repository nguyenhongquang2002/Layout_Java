package com.example.CategoryAsm.Model.Seeder;

import com.example.CategoryAsm.Entity.Category;
import com.example.CategoryAsm.Model.CategoryModel;
import com.example.CategoryAsm.Model.MySqlCategoryModel;

public class CategorySeeder {
    private CategoryModel categoryModel;

    public CategorySeeder() {
        this.categoryModel = new MySqlCategoryModel();
    }
}
