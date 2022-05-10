package com.example.StorePromotion.percistance.Entity;

import com.example.StorePromotion.model.PromotionType;

import java.math.BigInteger;

public class PromotionEntity {

    private String id;
    private PromotionType type;
    private Integer required_qty;
    private BigInteger price;
    private Integer free_qty;
}
