package com.example.QuanLyBanHang.Repository;

import com.example.QuanLyBanHang.Model.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct,Integer> {

}
