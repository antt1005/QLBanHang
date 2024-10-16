package com.example.QuanLyBanHang.Model;


import com.example.QuanLyBanHang.Base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Category")
@Data
@RequiredArgsConstructor
public class Category extends BaseEntity {


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
