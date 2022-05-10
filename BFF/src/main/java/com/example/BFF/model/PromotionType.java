package com.example.BFF.model;

import com.example.BFF.percistance.Entity.ProductEntity;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public enum PromotionType {

    QTY_BASED_PRICE_OVERRIDE(Arrays.asList("Dwt5F7KAhi","PWWe3w1SDU"),2,new BigInteger("123"),1);


    private List<String > id;
    private Integer required_qty;
    private BigInteger price;
    private Integer free_qty;

    <T> PromotionType(List<String> asList, int i, BigInteger i1, int i2) {
    }

    List<ProductEntity> getPromotionsList() {return null;
    }

}
