package com.nusiss.commonservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-service")
public interface OrderFeignClient {

    /*
     获取指定用户下单过的所有商品 ID 列表
     */
    @GetMapping("/order-items/user/{userId}/product-ids")
    List<Long> getProductIdsByUserId(@PathVariable("userId") Long userId);

    // 未来可添加更多接口
}
