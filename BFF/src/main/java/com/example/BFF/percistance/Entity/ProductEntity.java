package com.example.BFF.percistance.Entity;

import com.example.BFF.model.PromotionType;

import java.math.BigInteger;

public class ProductEntity {

    private String id;
    private PromotionType type;
    private String name;
    private Integer required_qty;
    private BigInteger price;
    private Integer free_qty;
    private ProductEntity[] promotions;
    private Integer amount;
}
