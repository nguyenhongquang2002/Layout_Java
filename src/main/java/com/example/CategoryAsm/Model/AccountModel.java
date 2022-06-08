package com.example.CategoryAsm.Model;
import com.example.CategoryAsm.Entity.Account;
import com.example.CategoryAsm.Entity.Category;

import java.util.List;
public interface AccountModel {
    boolean create(Account obj);
    boolean update(int id, Account obj);
    boolean delete(int id);
    Account findById(int id);
    Account findByUsername(String username);
    List<Account> findAll();
}
