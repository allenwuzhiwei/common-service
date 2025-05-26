package com.nusiss.commonservice.feign;

import com.nusiss.commonservice.config.ApiResponse;
import com.nusiss.commonservice.entity.CartItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/*
 Feign 客户端：用于调用 shoppingcart-service 获取用户购物车项
 */
@FeignClient(name = "shoppingcart-service")
public interface ShoppingCartFeignClient {

    /*
     获取用户购物车中的所有商品项
     @param userId 用户 ID
     @return 购物车商品项列表
     */
    @GetMapping("/cart/items")
    ApiResponse<List<CartItem>> getCartItems(@RequestParam("userId") Long userId);

    @DeleteMapping("/cart/clear")
    ApiResponse<String> clearCart(@RequestParam("userId") Long userId);
}
