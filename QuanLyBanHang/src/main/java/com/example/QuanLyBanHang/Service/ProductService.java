package com.example.QuanLyBanHang.Service;

import com.example.QuanLyBanHang.Model.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    Product findid(Integer id);
    Product update(Integer id,Product product);
    List<Product> getAll();
    boolean delete(Integer id);

}
