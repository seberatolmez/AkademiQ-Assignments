package com.springboot1.example.productAPI.v2.Repository;

import com.springboot1.example.productAPI.v1.Repository.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
