package com.example.QuanLyBanHang.Service.impl;

import com.example.QuanLyBanHang.Model.Users;
import com.example.QuanLyBanHang.Repository.UserRepo;
import com.example.QuanLyBanHang.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public Users cread(Users user) {
        return repo.save(user);
    }

    @Override
    public Users findId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Users> getAll() {
        return repo.findAll();
    }

    @Override
    public Users update(Integer id, Users user) {
        Users userupdate =repo.findById(id).orElse(null);
        if(userupdate != null){
         userupdate.setUserName(user.getUserName());
         userupdate.setPassWord(user.getPassWord());
         userupdate.setEmail(user.getEmail());
         userupdate.setAddress(user.getAddress());
         userupdate.setPhoneNumber(user.getPhoneNumber());
         userupdate.setStatus(user.getStatus());
         return repo.save(userupdate);
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Users userdelete = repo.findById(id).orElse(null);
        if(userdelete != null){
             repo.delete(userdelete);
             return true;
        }
        return false;
    }
}
