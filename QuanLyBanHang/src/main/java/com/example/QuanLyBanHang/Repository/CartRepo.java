package com.example.QuanLyBanHang.Repository;

import com.example.QuanLyBanHang.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart,Integer> {

}
