package com.example.orderserver.dao;

import com.example.orderserver.entity.SaleOrderHead;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SaleOrderHead)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-06 20:34:16
 */
public interface SaleOrderHeadDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SaleOrderHead queryById(long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SaleOrderHead> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param saleOrderHead 实例对象
     * @return 对象列表
     */
    List<SaleOrderHead> queryAll(SaleOrderHead saleOrderHead);

    /**
     * 新增数据
     *
     * @param saleOrderHead 实例对象
     * @return 影响行数
     */
    int insert(SaleOrderHead saleOrderHead);

    /**
     * 修改数据
     *
     * @param saleOrderHead 实例对象
     * @return 影响行数
     */
    int update(SaleOrderHead saleOrderHead);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}