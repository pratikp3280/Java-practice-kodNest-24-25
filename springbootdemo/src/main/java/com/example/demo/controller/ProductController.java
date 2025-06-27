package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Product;
import java.util.*;

@RestController
@RequestMapping("/products")  // Base URL for all endpoints
public class ProductController {

    // In-memory list of products (like temporary database)
    List<Product> productList = new ArrayList<>();

    // GET all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }

    // POST new product
    @PostMapping
    public String addProduct(@RequestBody Product product) {
        productList.add(product);
        return "Product added successfully!";
    }

    // GET product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // PUT (Update product)
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(updatedProduct.getName());
                p.setPrice(updatedProduct.getPrice());
                return "Product updated successfully!";    //if found it return and out of loop
            }
        }
        return "Product not found!";   // if product by id not found
    }

    // DELETE product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        boolean removed = productList.removeIf(p -> p.getId() == id);
        return removed ? "Product deleted!" : "Product not found!";
    }
}
