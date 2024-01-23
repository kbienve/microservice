package com.ecommerce.microservice.dao;

import com.ecommerce.microservice.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
}
