package com.example.QuanLyBanHang.Service.impl;

import com.example.QuanLyBanHang.Model.Category;
import com.example.QuanLyBanHang.Repository.CategoryRepo;
import com.example.QuanLyBanHang.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo repo;

    @Override
    public Category create(Category category) {
        return repo.save(category);
    }

    @Override
    public Category findid(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Category update(Integer id, Category category) {
        Category categoryupdate =repo.findById(id).orElse(null);
        if(categoryupdate !=null){
            categoryupdate.setName(category.getName());
            categoryupdate.setDescribe(category.getDescribe());
            categoryupdate.setProducts(category.getProducts());
            categoryupdate.setReviews(category.getReviews());
            categoryupdate.setStatus(category.getStatus());
            categoryupdate.setTimeCreated(category.getTimeCreated());
            categoryupdate.setTimeUpdated(category.getTimeUpdated());
          return repo.save(categoryupdate);

        }
        return null;
    }

    @Override
    public List<Category> getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        Category category= repo.findById(id).orElse(null);
        if(category !=null){
            repo.delete(category);
            return true;
        }
        return false;
    }
}
