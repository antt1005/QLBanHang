package com.example.QuanLyBanHang.Service;

import com.example.QuanLyBanHang.Model.CartProduct;

import java.util.List;

public interface CartProductService {
    CartProduct create(CartProduct cartProduct);
    CartProduct findid(Integer id);
    CartProduct update(Integer id,CartProduct cartProduct);
    List<CartProduct> getAll();
    boolean delete(Integer id);
}
