package com.projectjar.demo.service;

import com.projectjar.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProduct();
}
