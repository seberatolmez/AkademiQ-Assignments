package com.springboot1.example.productAPI.v2.Controlller;

import com.springboot1.example.productAPI.v1.Repository.Entities.Product;
import com.springboot1.example.productAPI.v2.Repository.ProductRepository2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    ProductRepository2 repository;
    
    public Controller(ProductRepository2 repository){
        this.repository = repository;
    }
    public Controller(){}
    
    @GetMapping
    public List<Product> getAllProducts2(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Product getProductById(int id){
        return  repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
                
    }
    @PostMapping
    public Product addProduct(Product product){
        return  repository.save(product);
    }
    @PutMapping
    public Product updateProduct(@PathVariable int id, Product productDetails){
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException(("Product not found")));
                
                product.setName(productDetails.getName());
                product.setPrice(productDetails.getPrice());
                product.setStock(productDetails.getStock());
                
                return repository.save(product);
    }
     
    @DeleteMapping
    public void deleteProductById(int id){
        repository.deleteById(id);
        System.out.println("Product deleted");
    }
    
    
    
}
