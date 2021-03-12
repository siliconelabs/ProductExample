package com.projectjar.demo.service;

import com.projectjar.demo.entity.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProduct();
}
