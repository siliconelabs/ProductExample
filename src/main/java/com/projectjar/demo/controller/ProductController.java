package com.projectjar.demo.controller;

import com.projectjar.demo.entity.Product;
import com.projectjar.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductServiceImpl productService;


    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProduct();
    }

    @PostMapping("/products")
    public Product createPRoduct(@RequestBody  Product product)
    {
        return productService.createProduct(product);
    }
}
