package com.example.QuanLyBanHang.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CartProduct")
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idCart")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;

    private Integer quantity;

    private Integer discount;

    private Integer totalMoney;

    private Integer status;

}
