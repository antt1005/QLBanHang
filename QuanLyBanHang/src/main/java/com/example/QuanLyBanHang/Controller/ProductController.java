package com.example.QuanLyBanHang.Controller;


import com.example.QuanLyBanHang.Model.Product;
import com.example.QuanLyBanHang.Service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl service;

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return service.getAll();
    }
    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id){
        Product product = service.findid(id);
        if(product != null){
            return "thanh cong"+product.toString();
        }else {
            return "that bai";
        }
    }
    @PostMapping("/create")
    public String create(@RequestBody Product product){
        Product productcreate = service.create(product);
        return "them thanh cong"+productcreate.toString();
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id,@RequestBody Product product){
        Product productupdate = service.findid(id);
        if(productupdate != null){
            service.update(id,productupdate);
            return "update thành công"+productupdate.toString();
        }else {
            return "thất bại";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        boolean product = service.delete(id);
        if(product){
            return "xóa thành công";
        }else {
            return "thất bại";
        }
    }


}
