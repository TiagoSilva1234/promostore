package com.example.StorePromotion.service;

import com.example.StorePromotion.percistance.Entity.ProductEntity;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ObjectMapper mapper = new ObjectMapper();
    InputStream inputStream;
    TypeReference<List<ProductEntity>> typeReference = new TypeReference<List<ProductEntity>>() {
    };
    List<ProductEntity> productsn;

    @Override
    public List<ProductEntity> getAllProducts() {
        return productsn;
    }

    @Override
    public ProductEntity getProductById(String id) {
        for(ProductEntity p : productsn){
            if(id.equals(p.getId())){
                return p;
            }
        }
        return null;
    }

    ProductServiceImpl() {
        try {
            this.inputStream = new FileInputStream("/Users/tiagosilva/Desktop/StorePromotion/src/main/java/com/example/StorePromotion/percistance/repositorys/products.json");
            this.productsn = mapper.readValue(inputStream, typeReference);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
