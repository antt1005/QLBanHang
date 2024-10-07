package com.example.QuanLyBanHang.Controller;

import com.example.QuanLyBanHang.Model.Cart;
import com.example.QuanLyBanHang.Service.impl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartServiceImpl service;

    @GetMapping("/getAll")
    public List<Cart> getAll(){
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id){
        Cart cart = service.findId(id);
        if(cart !=null){
            return "thành công"+cart.toString();
        }else {
            return "thất bại";
        }
    }
    @PostMapping("/create")
    public String create(@RequestBody Cart cart){
        Cart cartcreate = service.create(cart);
        return "thêm thành công " + cartcreate.toString();
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id,@RequestBody Cart cart){
        Cart cartupdate = service.findId(id);
        if(cartupdate != null){
            service.update(id,cartupdate);
            return "update thành công"+cartupdate.toString();
        }else {
            return "thất bại";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        boolean cart = service.delete(id);
        if(cart){
            return "xóa thành công";
        }else {
            return "xóa thất bại";
        }
    }

}
