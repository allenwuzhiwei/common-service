package com.nusiss.commonservice.entity;

import lombok.Data;

import java.math.BigDecimal;

/*
 用于调用 payment-service 接口的请求体对象
 包含订单号、用户 ID、支付金额、币种、支付方式等字段
 */
@Data
public class PaymentRequest {
    private Long orderId;         // 订单ID
    private Long userId;          // 付款人ID
    private BigDecimal amount;    // 支付金额
    private String currency;      // 币种，例如 CNY
    private String method;        // 支付方式，如 "WeChat" / "PayNow"
    private Long productId;
    private Long sellerId;

}
