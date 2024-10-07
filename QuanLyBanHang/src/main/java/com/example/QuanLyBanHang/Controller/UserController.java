package com.example.QuanLyBanHang.Controller;


import com.example.QuanLyBanHang.Model.Users;
import com.example.QuanLyBanHang.Service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/getAll")
    public List<Users> getAll(){
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public String getFind(@PathVariable Integer id){
       Users user = service.findId(id);
       if(user != null){
           return "thành công"+user.toString();
       }
       return "thất bại";
    }
    @PostMapping("/create")
    public String create(@RequestBody Users users){
        Users usercreate = service.cread(users);
        return "thêm thành công"+users.toString();
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id,@RequestBody Users users){
        Users userupdate = service.findId(id);
        if(userupdate != null){
            service.update(id,users);
            return "update thanh cong"+userupdate.toString();
        }
        return "thất bại";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        boolean users = service.delete(id);
        if(users){
            return "xóa thành công";
        }else {
            return "thất bại";
        }
        }
}
