package com.example.QuanLyBanHang.Model;

import com.example.QuanLyBanHang.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Product")
@Data
@RequiredArgsConstructor
public class Product extends BaseEntity {


    private String name;

    private Integer price;

    private String describe;

    private Integer quantity;

    private Integer status;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;


}

