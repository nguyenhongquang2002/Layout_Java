package com.example.CategoryAsm.Controller.Category;

import com.example.CategoryAsm.Entity.Category;
import com.example.CategoryAsm.Model.CategoryModel;
import com.example.CategoryAsm.Model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> productList = categoryModel.findByAll();
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("admin/category/list.jsp").forward(req, resp);
    }
}
