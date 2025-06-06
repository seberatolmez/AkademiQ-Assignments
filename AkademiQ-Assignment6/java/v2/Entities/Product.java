package com.springboot1.example.productAPI.v2.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    
    @Id //primary key 
    @GeneratedValue 
    private int id;
    
    private String name;
    
    private double price;
    private int stock;
    
    public Product(int id,String name,double price,int stock){
        this.id = id;
        this.name = name;
        this.price= price;
        this.stock = stock;
    }

    public Product() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
