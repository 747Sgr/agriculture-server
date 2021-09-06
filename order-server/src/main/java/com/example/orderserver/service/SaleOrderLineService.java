package com.example.orderserver.service;

import com.example.orderserver.entity.SaleOrderLine;
import java.util.List;

/**
 * (SaleOrderLine)表服务接口
 *
 * @author makejava
 * @since 2021-09-06 20:34:27
 */
public interface SaleOrderLineService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SaleOrderLine queryById(long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SaleOrderLine> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param saleOrderLine 实例对象
     * @return 实例对象
     */
    SaleOrderLine insert(SaleOrderLine saleOrderLine);

    /**
     * 修改数据
     *
     * @param saleOrderLine 实例对象
     * @return 实例对象
     */
    SaleOrderLine update(SaleOrderLine saleOrderLine);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}