package com.example.orderserver.controller;

import com.example.orderserver.entity.SaleOrderLine;
import com.example.orderserver.service.SaleOrderLineService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SaleOrderLine)表控制层
 *
 * @author makejava
 * @since 2021-08-02 20:36:23
 */
@RestController
@RequestMapping("saleOrderLine")
public class SaleOrderLineController {
    /**
     * 服务对象
     */
    @Resource
    private SaleOrderLineService saleOrderLineService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SaleOrderLine selectOne(long id) {
        return this.saleOrderLineService.queryById(id);
    }

}