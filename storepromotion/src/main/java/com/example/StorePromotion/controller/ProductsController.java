package com.example.StorePromotion.controller;


import com.example.StorePromotion.percistance.Entity.ProductEntity;
import com.example.StorePromotion.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductsController {
    private final ProductServiceImpl productService;


    @GetMapping("/products")
    ResponseEntity<List<ProductEntity>> getAllProducts(){

        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/products/{id}")
    ResponseEntity<ProductEntity> getProductId(@PathVariable String id){
        return ResponseEntity.ok(productService.getProductById(id));
    }





}
