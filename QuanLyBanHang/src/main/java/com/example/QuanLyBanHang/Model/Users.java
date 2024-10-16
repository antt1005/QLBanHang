package com.example.QuanLyBanHang.Model;


import com.example.QuanLyBanHang.Base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
public class Users extends BaseEntity {


    private String userName;

    private String passWord;

    private String email;

    private String address;

    private String phoneNumber;

    private Integer status;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Cart> carts;  // Danh sách giỏ hàng của User


    public Users(String userName, String passWord, String email, String address, String phoneNumber, Integer status) {
    }
}
