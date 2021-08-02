package com.example.orderserver.service;

import com.example.orderserver.entity.SaleOrder;
import java.util.List;

/**
 * (SaleOrder)表服务接口
 *
 * @author makejava
 * @since 2021-08-02 19:54:12
 */
public interface SaleOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SaleOrder queryById(long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SaleOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param saleOrder 实例对象
     * @return 实例对象
     */
    SaleOrder insert(SaleOrder saleOrder);

    /**
     * 修改数据
     *
     * @param saleOrder 实例对象
     * @return 实例对象
     */
    SaleOrder update(SaleOrder saleOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}