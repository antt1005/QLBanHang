package com.example.QuanLyBanHang.Service;

import com.example.QuanLyBanHang.Model.Users;

import java.util.List;

public interface UserService {

    Users cread(Users user);
    Users findId(Integer id);
    List<Users> getAll();
    Users update(Integer id, Users user);
    boolean delete(Integer id);
}
