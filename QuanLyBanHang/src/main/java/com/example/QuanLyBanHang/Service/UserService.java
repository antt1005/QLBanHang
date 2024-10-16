package com.example.QuanLyBanHang.Service;

import com.example.QuanLyBanHang.Model.Users;
import com.example.QuanLyBanHang.request.UserSaveRequest;

import java.util.List;

public interface UserService {

    UserSaveRequest cread(UserSaveRequest user);
    Users findId(Integer id);
    List<Users> getAll();
    Users update(Integer id, Users user);
    boolean delete(Integer id);
}
