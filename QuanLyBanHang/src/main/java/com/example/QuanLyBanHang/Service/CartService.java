package com.example.QuanLyBanHang.Service;

import com.example.QuanLyBanHang.Model.Cart;

import java.util.List;

public interface CartService {
    Cart create (Cart cart);
    Cart findId (Integer id);
    Cart update (Integer id ,Cart cart);
    List<Cart> getAll();
    boolean delete(Integer id);
}
