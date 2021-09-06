package com.example.orderserver.service.impl;

import com.example.orderserver.entity.SaleOrderHead;
import com.example.orderserver.dao.SaleOrderHeadDao;
import com.example.orderserver.service.SaleOrderHeadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SaleOrderHead)表服务实现类
 *
 * @author makejava
 * @since 2021-09-06 20:34:16
 */
@Service("saleOrderHeadService")
public class SaleOrderHeadServiceImpl implements SaleOrderHeadService {
    @Resource
    private SaleOrderHeadDao saleOrderHeadDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SaleOrderHead queryById(long id) {
        return this.saleOrderHeadDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SaleOrderHead> queryAllByLimit(int offset, int limit) {
        return this.saleOrderHeadDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param saleOrderHead 实例对象
     * @return 实例对象
     */
    @Override
    public SaleOrderHead insert(SaleOrderHead saleOrderHead) {
        this.saleOrderHeadDao.insert(saleOrderHead);
        return saleOrderHead;
    }

    /**
     * 修改数据
     *
     * @param saleOrderHead 实例对象
     * @return 实例对象
     */
    @Override
    public SaleOrderHead update(SaleOrderHead saleOrderHead) {
        this.saleOrderHeadDao.update(saleOrderHead);
        return this.queryById(saleOrderHead.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.saleOrderHeadDao.deleteById(id) > 0;
    }
}