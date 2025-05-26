package com.nusiss.commonservice.feign;

import com.nusiss.commonservice.config.ApiResponse;
import com.nusiss.commonservice.entity.InventoryChangeRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "inventory-service")
public interface InventoryFeignClient {

    @GetMapping("/inventory/quantity/{productId}")
    ApiResponse<Integer> getInventoryQuantity(@PathVariable("productId") Long productId);

    @PostMapping("/inventory/deduct")
    ApiResponse<Boolean> deductInventory(@RequestBody InventoryChangeRequest request);
}

