package com.example.QuanLyBanHang.Service.impl;

import com.example.QuanLyBanHang.Model.CartProduct;
import com.example.QuanLyBanHang.Repository.CartProductRepo;
import com.example.QuanLyBanHang.Service.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartProductServiceImpl implements CartProductService {

    @Autowired
    private CartProductRepo repo;

    @Override
    public CartProduct create(CartProduct cartProduct) {
        return repo.save(cartProduct);
    }

    @Override
    public CartProduct findid(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public CartProduct update(Integer id, CartProduct cartProduct) {
        CartProduct cartProductupdate = repo.findById(id).orElse(null);
        if(cartProductupdate != null){
            cartProductupdate.setCart(cartProduct.getCart());
            cartProductupdate.setProduct(cartProduct.getProduct());
            cartProductupdate.setDiscount(cartProduct.getDiscount());
            cartProductupdate.setQuantity(cartProduct.getQuantity());
            cartProductupdate.setStatus(cartProduct.getStatus());
            cartProductupdate.setTotalMoney(cartProduct.getTotalMoney());
            return repo.save(cartProductupdate);
        }
        return null;
    }

    @Override
    public List<CartProduct> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        CartProduct cartProduct = repo.findById(id).orElse(null);
        if(cartProduct != null){
            repo.delete(cartProduct);
            return true;
        }else {
            return false;
        }

    }
}
