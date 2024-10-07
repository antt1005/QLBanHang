package com.example.QuanLyBanHang.Model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    private String name;

    private Integer price;

    private String describe;

    private Integer quantity;

    private Integer status;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;


}

