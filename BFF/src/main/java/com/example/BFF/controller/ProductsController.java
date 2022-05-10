package com.example.BFF.controller;

import com.example.BFF.percistance.Entity.ProductEntity;
import com.example.BFF.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductsController {

    private final ProductServiceImpl productService;


    @GetMapping("/products")
    ResponseEntity<List<ProductEntity>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }


    @GetMapping("products/{id}")
    ResponseEntity<ProductEntity> getProductId(@PathVariable String id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

}
