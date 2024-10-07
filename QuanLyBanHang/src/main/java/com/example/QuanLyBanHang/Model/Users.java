package com.example.QuanLyBanHang.Model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "pass_word")
    private String passWord;

    private String email;

    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;

    private Integer status;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Cart> carts;  // Danh sách giỏ hàng của User

}
