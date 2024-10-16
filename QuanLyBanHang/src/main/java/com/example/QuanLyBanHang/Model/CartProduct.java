package com.example.QuanLyBanHang.Model;


import com.example.QuanLyBanHang.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "CartProduct")
@Data
@RequiredArgsConstructor
public class CartProduct extends BaseEntity {



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
