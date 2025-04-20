package com.springboot1.example.productAPI.Entities.Repository;

import com.springboot1.example.productAPI.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
