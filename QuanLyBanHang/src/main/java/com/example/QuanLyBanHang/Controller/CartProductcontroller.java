package com.example.QuanLyBanHang.Controller;

import com.example.QuanLyBanHang.Model.CartProduct;
import com.example.QuanLyBanHang.Service.impl.CartProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartProduct")
public class CartProductcontroller {
    @Autowired
    private CartProductServiceImpl service;

    @GetMapping("/getAll")
    public List<CartProduct> getAll() {
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public String findid(@PathVariable Integer id) {
        CartProduct cartProduct = service.findid(id);
        if (cartProduct != null) {
            return "tìm thấy " + cartProduct.toString();
        } else {
            return "k thấy";
        }
    }

    @PostMapping("/create")
    public String create(@RequestBody CartProduct cartProduct) {
        service.create(cartProduct);
        return "thêm thành công " + cartProduct.toString();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id, @RequestBody CartProduct cartProduct) {
        CartProduct cartProductupdate = service.findid(id);
        if (cartProductupdate != null) {
            service.update(id, cartProductupdate);
            return "update thành công " + cartProductupdate.toString();
        } else {
            return "update thất bại ";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean cartProduct = service.delete(id);
        if (cartProduct) {
            return "xóa thành công";
        } else {
            return "xóa thất bại";
        }
    }

}
