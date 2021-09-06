package com.example.productserver.controller;

import com.example.productserver.entity.Product;
import com.example.productserver.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Product)表控制层
 *
 * @author makejava
 * @since 2021-09-06 21:25:35
 */
@RestController
@RequestMapping("product")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Product selectOne(long id) {
        return this.productService.queryById(id);
    }

}