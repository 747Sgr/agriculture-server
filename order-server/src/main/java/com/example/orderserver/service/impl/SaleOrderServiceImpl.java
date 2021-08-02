package com.example.orderserver.service.impl;

import com.example.orderserver.entity.SaleOrder;
import com.example.orderserver.dao.SaleOrderDao;
import com.example.orderserver.service.SaleOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SaleOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-08-02 19:54:15
 */
@Service("saleOrderService")
public class SaleOrderServiceImpl implements SaleOrderService {
    @Resource
    private SaleOrderDao saleOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SaleOrder queryById(long id) {
        return this.saleOrderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SaleOrder> queryAllByLimit(int offset, int limit) {
        return this.saleOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param saleOrder 实例对象
     * @return 实例对象
     */
    @Override
    public SaleOrder insert(SaleOrder saleOrder) {
        this.saleOrderDao.insert(saleOrder);
        return saleOrder;
    }

    /**
     * 修改数据
     *
     * @param saleOrder 实例对象
     * @return 实例对象
     */
    @Override
    public SaleOrder update(SaleOrder saleOrder) {
        this.saleOrderDao.update(saleOrder);
        return this.queryById(saleOrder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.saleOrderDao.deleteById(id) > 0;
    }
}