package com.example.CategoryAsm.Controller.Shoppingcart;

import com.example.CategoryAsm.Entity.Shoppingcart;
import com.example.CategoryAsm.Model.MySqlProductModel;
import com.example.CategoryAsm.Model.ProductModel;
import com.example.CategoryAsm.util.ShoppingCartHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveCartServlet extends HttpServlet {

    private ProductModel productModel;

    public RemoveCartServlet(){
        this.productModel = new MySqlProductModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            // lấy tham số khi người dùng tiến hành click add to cart
            Integer productId = Integer.parseInt(req.getParameter("productId"));
            // check xem shopping cart có trong session chưa , có rồi thì lấy ra
            // chưa có tạo mới
            ShoppingCartHelper shoppingCartHelper = new ShoppingCartHelper(req);
            Shoppingcart shoppingcart = shoppingCartHelper.getCart();
            // thêm sản phẩm vào shopping cart
            shoppingcart.remove(productId);
            // lưu shopping cart vào session
            shoppingCartHelper.saveCart(shoppingcart);
            resp.sendRedirect("/shopping-cart/get");
        }catch (Exception ex){
            resp.getWriter().println(ex.getMessage());
        }
    }
}
