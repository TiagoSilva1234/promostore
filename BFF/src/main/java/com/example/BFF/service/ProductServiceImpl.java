package com.example.BFF.service;


import com.example.BFF.percistance.Entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
      private final RestTemplate restTemplate;




    @Override
    public List<ProductEntity> getAllProducts() {
  ResponseEntity<List<ProductEntity>> prods=  restTemplate.exchange("http://localhost:8081/products",
          HttpMethod.GET,
          null,
          new ParameterizedTypeReference<List<ProductEntity>>(){});
    List<ProductEntity> finalProds = prods.getBody();

        System.out.println(finalProds);
        return finalProds;
    }

    @Override
    public ProductEntity getProductById(String id) {
        return null;
    }
}
