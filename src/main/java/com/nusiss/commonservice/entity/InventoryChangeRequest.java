package com.nusiss.commonservice.entity;

import lombok.Data;

@Data
public class InventoryChangeRequest {
    private Long productId;
    private Integer quantity;
    private String operator; // 一般可写为 "order-service" 或 "system"
}
