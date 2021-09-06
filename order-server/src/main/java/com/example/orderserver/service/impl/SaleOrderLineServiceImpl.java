package com.example.orderserver.service.impl;

import com.example.orderserver.entity.Product;
import com.example.orderserver.entity.SaleOrderLine;
import com.example.orderserver.dao.SaleOrderLineDao;
import com.example.orderserver.feignclient.ProductFeignClient;
import com.example.orderserver.service.SaleOrderLineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SaleOrderLine)表服务实现类
 *
 * @author makejava
 * @since 2021-09-06 20:34:27
 */
@Service("saleOrderLineService")
@Slf4j
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
        SaleOrderLine line = this.saleOrderLineDao.queryById(id);
        Product product = productFeignClient.selectOne(line.getProductId());
        log.info(product.toString());
        if (!ObjectUtils.isEmpty(product)){
            line.setProductName(product.getProductName());
        }

        return this.saleOrderLineDao.queryById(id);
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