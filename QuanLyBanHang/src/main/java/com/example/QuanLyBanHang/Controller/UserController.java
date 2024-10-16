package com.example.QuanLyBanHang.Controller;


import com.example.QuanLyBanHang.Model.Users;
import com.example.QuanLyBanHang.Service.UserService;
import com.example.QuanLyBanHang.request.UserSaveRequest;
import com.example.QuanLyBanHang.validate.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private UserValidator  validator;

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
    public UserSaveRequest create(@RequestBody UserSaveRequest users){
        validator.validateStaffSaveRequest(users);
        return service.cread(users);
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
