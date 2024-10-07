package com.example.QuanLyBanHang.Service.impl;

import com.example.QuanLyBanHang.Model.Product;
import com.example.QuanLyBanHang.Repository.ProductRepo;
import com.example.QuanLyBanHang.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repo;

    @Override
    public Product create(Product product) {
        return repo.save(product);
    }

    @Override
    public Product findid(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Product update(Integer id, Product product) {
        Product productupdate = repo.findById(id).orElse(null);
        if(productupdate !=null){
            productupdate.setDescribe(product.getDescribe());
            productupdate.setPrice(product.getPrice());
            productupdate.setName(product.getName());
            productupdate.setQuantity(product.getQuantity());
            productupdate.setStatus(product.getStatus());
            productupdate.setCategory(product.getCategory());
            return repo.save(product);
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        Product product = repo.findById(id).orElse(null);
        if(product != null){
            repo.delete(product);
            return true;
        }
        return false;
    }
}
