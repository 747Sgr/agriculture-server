package com.example.orderserver.fallback;

import com.example.orderserver.entity.Product;
import com.example.orderserver.feignclient.ProductFeignClient;
import org.springframework.stereotype.Component;

/**
 * 类描述：
 *
 * @ClassName ProductFallback
 * @Description TODO
 * @Author shiguorang
 * @Date 2021/8/9 21:38
 * @Version 1.0
 */
@Component
public class ProductFallback implements ProductFeignClient {

    @Override
    public Product selectOne(Long id) {
        Product product = new Product();
        product.setRemarks("order 服务熔断");
        return product;
    }
}
