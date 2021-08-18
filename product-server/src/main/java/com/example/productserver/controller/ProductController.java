package com.example.productserver.controller;

import com.example.productserver.entity.Product;
import com.example.productserver.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Product)表控制层
 *
 * @author makejava
 * @since 2021-07-31 10:23:19
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
    public Product selectOne(@RequestParam Long id) {
        return this.productService.queryById(id);
    }

    /**
     * @description: 获取商品列表
     * @param:
     * @return:
     * @author shiguorang
     * @date: 2021/8/9 19:59
     */
    @PostMapping("/getList")
    public List<Product> getList(@RequestBody Product product){
        return this.productService.getList(product);
    }

    /**
     * @description: null
     * @param:
     * @return:
     * @author shiguorang
     * @date: 2021/8/9 20:40
     */
    @PutMapping("/update")
    public Product update(@RequestBody Product product){
        return this.productService.update(product);
    }

}