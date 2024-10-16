package com.example.QuanLyBanHang.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserSaveRequest {
    private String userName;
    private String passWord;
    private String email;
    private String address;
    private String phoneNumber;
    private Integer status;
}
