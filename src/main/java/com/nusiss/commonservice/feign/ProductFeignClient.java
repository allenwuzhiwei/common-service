package com.nusiss.commonservice.feign;

import com.nusiss.commonservice.config.ApiResponse;
import com.nusiss.commonservice.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service") // 服务名必须和注册中心一致
public interface ProductFeignClient {

    @GetMapping("/products/{id}") // 对应 product-service 的接口路径
    ApiResponse<Product> getProductById(@PathVariable("id") Long id);
}
