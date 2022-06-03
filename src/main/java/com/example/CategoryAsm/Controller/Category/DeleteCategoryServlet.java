package com.example.CategoryAsm.Controller.Category;

import com.example.CategoryAsm.Entity.Category;

import com.example.CategoryAsm.Entity.StatusEnum.CategoryStatus;
import com.example.CategoryAsm.Model.CategoryModel;
import com.example.CategoryAsm.Model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class DeleteCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int categoryId = Integer.parseInt(req.getParameter("id"));
        Category category = CategoryModel.findById(categoryId);
        category.setStatus(CategoryStatus.DELETED);
        category.setDeletedAt(LocalDateTime.now());
        // Xóa cứng (hard delete) => Chỉ dùng khi muốn xóa cứng trong thùng rác
//        if(productModel.delete(productId)) {
//            resp.sendRedirect("/products");
//        }
        // Xóa mềm (soft delete) => Nên dùng
        if(categoryModel.update(categoryId, category)) {
            resp.sendRedirect("admin/category/list.jsp");
        }
    }
}
