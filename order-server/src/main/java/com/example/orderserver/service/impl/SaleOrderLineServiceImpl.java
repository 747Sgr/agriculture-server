package com.example.orderserver.service.impl;

import com.example.orderserver.entity.Product;
import com.example.orderserver.entity.SaleOrderLine;
import com.example.orderserver.dao.SaleOrderLineDao;
import com.example.orderserver.feignclient.ProductFeignClient;
import com.example.orderserver.service.SaleOrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SaleOrderLine)表服务实现类
 *
 * @author makejava
 * @since 2021-08-02 20:36:23
 */
@Service("saleOrderLineService")
public class SaleOrderLineServiceImpl implements SaleOrderLineService {
    @Resource
    private SaleOrderLineDao saleOrderLineDao;

    @Resource
    private ProductFeignClient productFeignClient;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SaleOrderLine queryById(long id) {
        SaleOrderLine saleOrderLine = saleOrderLineDao.queryById(id);
        Product product = productFeignClient.selectOne(saleOrderLine.getProductId());
        saleOrderLine.setProductName(product.getProductName());
        return saleOrderLine;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SaleOrderLine> queryAllByLimit(int offset, int limit) {
        return this.saleOrderLineDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param saleOrderLine 实例对象
     * @return 实例对象
     */
    @Override
    public SaleOrderLine insert(SaleOrderLine saleOrderLine) {
        this.saleOrderLineDao.insert(saleOrderLine);
        return saleOrderLine;
    }

    /**
     * 修改数据
     *
     * @param saleOrderLine 实例对象
     * @return 实例对象
     */
    @Override
    public SaleOrderLine update(SaleOrderLine saleOrderLine) {
        this.saleOrderLineDao.update(saleOrderLine);
        return this.queryById(saleOrderLine.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.saleOrderLineDao.deleteById(id) > 0;
    }
}