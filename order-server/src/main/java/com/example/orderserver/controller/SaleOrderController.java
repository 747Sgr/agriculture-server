package com.example.orderserver.controller;

import com.example.orderserver.entity.SaleOrder;
import com.example.orderserver.service.SaleOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SaleOrder)表控制层
 *
 * @author makejava
 * @since 2021-08-02 19:54:15
 */
@RestController
@RequestMapping("saleOrder")
public class SaleOrderController {
    /**
     * 服务对象
     */
    @Resource
    private SaleOrderService saleOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SaleOrder selectOne(long id) {
        return saleOrderService.queryById(id);
    }

}