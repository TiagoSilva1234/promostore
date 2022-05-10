package com.example.StorePromotion.service;

import com.example.StorePromotion.percistance.Entity.ProductEntity;

import java.util.List;

public interface ProductService {



    List<ProductEntity> getAllProducts();

    ProductEntity getProductById(String id);
}
