package com.springboot1.example.productAPI.Controller;

import com.springboot1.example.productAPI.Entities.Product;
import com.springboot1.example.productAPI.Entities.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {
    private ProductRepository repository;

    public ProductController(ProductRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(int id){
        return repository.findById(id).
                orElseThrow(()-> new RuntimeException(("Product not found")));
    }

    @PostMapping
    public Product createProduct(Product product){
        return repository.save(product);
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, Product productDetails){
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setStock(productDetails.getStock());

        return repository.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(int id){
        repository.deleteById(id);
        System.out.println("Product deleted");
    }


}
