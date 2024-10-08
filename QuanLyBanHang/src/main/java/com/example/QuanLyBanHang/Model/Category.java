package com.example.QuanLyBanHang.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategory;

    private String name;

    private String reviews;

    private String describe;

    private Integer timeCreated;

    private Integer timeUpdated;

    private Integer status;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;
}
