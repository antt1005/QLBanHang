package com.example.QuanLyBanHang.Service;


import com.example.QuanLyBanHang.Model.Category;

import java.util.List;

public interface CategoryService {
    Category create (Category category);
    Category findid (Integer id);
    Category update (Integer id,Category category);
    List<Category> getAll();
    boolean delete(Integer id);

}
