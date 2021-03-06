package com.example.CategoryAsm.util;

import com.example.CategoryAsm.Entity.Shoppingcart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ShoppingCartHelper {
    private static final String SHOPPING_CART_SESSTIOM_NAME = "SHOPPING_CART";
    HttpSession session;

    public ShoppingCartHelper(HttpServletRequest request){this.session = request.getSession();}

    public Shoppingcart getCart(){
        Shoppingcart shoppingcart = (Shoppingcart) session.getAttribute(SHOPPING_CART_SESSTIOM_NAME);
        if (shoppingcart == null){
            shoppingcart = new Shoppingcart();
        }
        return shoppingcart;
    }
    public void saveCart(Shoppingcart shoppingcart){
        session.setAttribute(SHOPPING_CART_SESSTIOM_NAME,shoppingcart);
    }
}
