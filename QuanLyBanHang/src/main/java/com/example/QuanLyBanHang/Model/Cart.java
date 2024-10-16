package com.example.QuanLyBanHang.Model;

import com.example.QuanLyBanHang.Base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Cart")
@Data
@RequiredArgsConstructor
public class Cart extends BaseEntity {

    private String name;

    private Integer timecreated;

    private String note;

    private Integer status;

    @ManyToOne()
    @JoinColumn(name = "idUser")
    @JsonBackReference
    private Users user;

}
