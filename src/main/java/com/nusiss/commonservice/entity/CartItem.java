package com.nusiss.commonservice.entity;

import lombok.Data;

import java.math.BigDecimal;

/*
 购物车中的商品项，用于接收 shoppingcart-service 返回的结构
 */
@Data
public class CartItem {
    private Long id;           // 购物车项主键（可选）
    private Long productId;    // 商品 ID
    private Integer quantity;  // 商品数量
}
