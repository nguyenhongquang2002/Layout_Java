package com.example.CategoryAsm.Model;

import com.example.CategoryAsm.Entity.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqlCategoryModelTest {
    @Test
    void save() {
        MySqlCategoryModel mySqlAccountModel = new MySqlCategoryModel();
        Category category = new Category(1,"name");
        assertEquals(true, mySqlAccountModel.save(category));
    }
}