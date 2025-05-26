package com.nusiss.commonservice.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Payment {
    private Long id;
    private Long orderId;
    private Long senderAccountId;
    private BigDecimal amount;
    private String currency;
    private String paymentStatus;
    private String verificationMethod;
    private LocalDateTime paymentDate;
}
