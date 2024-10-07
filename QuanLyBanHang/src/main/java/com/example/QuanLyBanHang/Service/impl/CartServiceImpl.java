package com.example.QuanLyBanHang.Service.impl;


import com.example.QuanLyBanHang.Model.Cart;
import com.example.QuanLyBanHang.Repository.CartRepo;
import com.example.QuanLyBanHang.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepo repo;
    @Override
    public Cart create(Cart cart) {
        return repo.save(cart);
    }

    @Override
    public Cart findId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Cart update(Integer id, Cart cart) {
        Cart cartupdate = repo.findById(id).orElse(null);
        if(cartupdate != null){
            cartupdate.setName(cart.getName());
            cartupdate.setNote(cart.getNote());
            cartupdate.setStatus(cart.getStatus());
            cartupdate.setTimecreated(cart.getTimecreated());
            cartupdate.setUser(cart.getUser());
            return repo.save(cartupdate);
        }
        return null;
    }

    @Override
    public List<Cart> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        Cart cart = repo.findById(id).orElse(null);
        if(cart != null){
            repo.delete(cart);
            return true;
        }
        return false;
    }
}
