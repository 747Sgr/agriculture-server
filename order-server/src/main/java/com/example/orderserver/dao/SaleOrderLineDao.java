package com.example.orderserver.dao;

import com.example.orderserver.entity.SaleOrderLine;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SaleOrderLine)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-02 20:36:23
 */
public interface SaleOrderLineDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SaleOrderLine queryById(long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SaleOrderLine> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param saleOrderLine 实例对象
     * @return 对象列表
     */
    List<SaleOrderLine> queryAll(SaleOrderLine saleOrderLine);

    /**
     * 新增数据
     *
     * @param saleOrderLine 实例对象
     * @return 影响行数
     */
    int insert(SaleOrderLine saleOrderLine);

    /**
     * 修改数据
     *
     * @param saleOrderLine 实例对象
     * @return 影响行数
     */
    int update(SaleOrderLine saleOrderLine);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}