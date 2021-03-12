package com.projectjar.demo.repository;

import com.projectjar.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Long> {

}
