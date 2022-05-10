package com.example.BFF.service;

import com.example.BFF.percistance.Entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> getAllProducts();
    ProductEntity getProductById(String id);
}
