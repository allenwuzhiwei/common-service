package com.nusiss.commonservice.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private Long sellerId;  // 卖家 ID
}
