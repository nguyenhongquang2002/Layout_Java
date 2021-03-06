package com.example.CategoryAsm.Controller.Product;

import com.example.CategoryAsm.Entity.Product;
import com.example.CategoryAsm.Entity.StatusEnum.ProductStatus;
import com.example.CategoryAsm.Model.MySqlProductModel;
import com.example.CategoryAsm.Model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class DeleteProductServlet extends HttpServlet {
    private ProductModel productModel;

    @Override
    public void init() throws ServletException {
        productModel = new MySqlProductModel();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int productId = Integer.parseInt(req.getParameter("id"));
        Product product = productModel.findById(productId);
        product.setStatus(ProductStatus.DELETED);
        product.setDeletedAt(LocalDateTime.now());
        // Xóa cứng (hard delete) => Chỉ dùng khi muốn xóa cứng trong thùng rác
//        if(productModel.delete(productId)) {
//            resp.sendRedirect("/products");
//        }
        // Xóa mềm (soft delete) => Nên dùng
        if(productModel.update(productId, product)) {
            resp.sendRedirect("admin/products");
        }
    }
}
