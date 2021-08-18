package com.example.apiserver.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类描述：代码实现gateway路由转发
 *
 * @ClassName OrderrRoute
 * @Description TODO
 * @Author shiguorang
 * @Date 2021/8/16 20:07
 * @Version 1.0
 */
@Configuration
public class OrderRoute {

//    @Bean
//    public RouteLocator order(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route("orderRoute",r -> r.path("/saleOrder/**","/saleOrderLine/**")
//                        .uri("http://localhost:8084/"))
//                .build();
//    }
}
