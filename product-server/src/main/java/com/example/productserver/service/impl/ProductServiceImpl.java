package com.example.productserver.service.impl;

import com.example.productserver.entity.Product;
import com.example.productserver.dao.ProductDao;
import com.example.productserver.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Product)表服务实现类
 *
 * @author makejava
 * @since 2021-07-31 10:23:19
 */
@Service("productService")
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Product queryById(Long id) {
        if (id < 0){
            throw new RuntimeException("id 非法");
        }
        log.info(applicationName+"  "+port+"被调用");
        return this.productDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Product> queryAllByLimit(int offset, int limit) {
        return this.productDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public Product insert(Product product) {
        this.productDao.insert(product);
        return product;
    }

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    @HystrixCommand(defaultFallback = "fallback")
    public Product update(Product product) {
        if (product.getId() == 1){
            throw new RuntimeException();
        }
        this.productDao.update(product);
        return this.queryById(product.getId());
    }

    /** 
     * @description: 默认熔断方法
     * @param: 
     * @return: 
     * @author shiguorang
     * @date: 2021/8/9 20:55
     */
    public Product fallback() {
        Product product = new Product();
        product.setRemarks("服务降级");
        return product;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.productDao.deleteById(id) > 0;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getListFallBack")
    public List<Product> getList(Product product) {
        if (product.getId()==2){
            throw new RuntimeException();
        }
        return productDao.queryAll(product);
    }

    /** 
     * @description: 自定义熔断方法
     * @param: 
     * @return: 
     * @author shiguorang
     * @date: 2021/8/9 20:40
     */ 
    public List<Product> getListFallBack(Product product){
        product.setRemarks("服务降级");
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }
}