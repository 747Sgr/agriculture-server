package com.example.orderserver.controller;

import com.example.orderserver.entity.SaleOrderHead;
import com.example.orderserver.service.SaleOrderHeadService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SaleOrderHead)表控制层
 *
 * @author makejava
 * @since 2021-09-06 20:34:16
 */
@RestController
@RequestMapping("saleOrderHead")
public class SaleOrderHeadController {
    /**
     * 服务对象
     */
    @Resource
    private SaleOrderHeadService saleOrderHeadService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SaleOrderHead selectOne(long id) {
        return this.saleOrderHeadService.queryById(id);
    }

}