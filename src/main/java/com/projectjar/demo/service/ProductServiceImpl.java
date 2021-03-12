package com.projectjar.demo.service;

import com.projectjar.demo.entity.Product;
import com.projectjar.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return  productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll() ;
    }
}
