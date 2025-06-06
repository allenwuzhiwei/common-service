package com.nusiss.commonservice.feign;

import com.nusiss.commonservice.config.ApiResponse;
import com.nusiss.commonservice.entity.PaymentRequest;
import com.nusiss.commonservice.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用于远程调用 payment-service 的 Feign 接口
 * 提供订单支付处理能力
 */
@FeignClient(name = "payment-service") // 服务名应与 Eureka 注册一致
public interface PaymentFeignClient {

    /*
     远程调用：执行支付处理
     @param request 支付请求体（订单ID、用户ID、金额、方式等）
     @return 支付结果，包含支付记录（状态应为 PAID）
     */
    @PostMapping("/payment/process")
    ApiResponse<Payment> processPayment(@RequestBody PaymentRequest request);
}
