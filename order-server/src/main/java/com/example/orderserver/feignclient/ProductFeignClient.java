package com.example.orderserver.feignclient;

import com.example.orderserver.entity.Product;
import com.example.orderserver.fallback.ProductFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类描述：
 *
 * @ClassName ProductrFeignClient
 * @Description 服务间调用，product
 * @Author shiguorang
 * @Date 2021/8/2 20:49
 * @Version 1.0
 */
@FeignClient(name = "PRODUCT-SERVER", fallback = ProductFallback.class)
public interface ProductFeignClient {

    /**
     * @description: 通过id获取商品
     * @param:
     * @return:
     * @author shiguorang
     * @date: 2021/8/9 22:14
     */
    @GetMapping("product/selectOne")
    Product selectOne(@RequestParam Long id);
}
