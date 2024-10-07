package com.example.QuanLyBanHang.Controller;


import com.example.QuanLyBanHang.Model.Category;
import com.example.QuanLyBanHang.Service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl service;

    @GetMapping("/getAll")
    public List<Category> getAll(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id){
        Category category = service.findid(id);
        if(category !=null){
            return "tìm thành công"+category.toString();
        }else {
            return "k tìm thấy";
        }
    }

    @PostMapping("/create")
    public String create(@RequestBody Category category){
         service.create(category);
         return "thêm thành công"+category.toString();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id ,@RequestBody Category category){
        Category categoryupdate = service.findid(id);
        if(categoryupdate !=null){
            service.update(id,categoryupdate);
            return "update thành công"+categoryupdate.toString();
        }else {
            return "thất bại";
        }
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        boolean category = service.delete(id);
        if(category){
            return "xóa thành công";
        }else {
            return "xóa thất bại";
        }
    }




}
