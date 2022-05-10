package com.example.BFF.service;


import com.example.BFF.percistance.Entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public List<ProductEntity> getAllProducts() {

        return null;
    }

    @Override
    public ProductEntity getProductById(String id) {
        return null;
    }
}
