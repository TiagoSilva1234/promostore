package com.example.BFF.percistance.Entity;

import com.example.BFF.model.PromotionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigInteger;



@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
