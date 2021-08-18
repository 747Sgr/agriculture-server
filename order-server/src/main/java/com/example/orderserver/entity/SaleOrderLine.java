package com.example.orderserver.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SaleOrderLine)实体类
 *
 * @author makejava
 * @since 2021-08-02 20:36:23
 */
@Data
public class SaleOrderLine implements Serializable {
    private static final long serialVersionUID = -92712896428375252L;
    
    private Long id;
    
    private Date createAt;
    
    private String createBy;
    
    private Date updateAt;
    
    private String updateBy;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
    * 数量
    */
    private Double quantity;
    /**
    * 单价
    */
    private Double price;
    
    private String remarks;

}