package com.example.QuanLyBanHang.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name = "Cart")

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCart;

    private String name;

    private Integer timecreated;

    private String note;

    private Integer status;

    @ManyToOne()
    @JoinColumn(name = "idUser")
    @JsonBackReference
    private Users user;

}
