package com.example.productserver.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2021-07-31 10:23:19
 */
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 708335365087214723L;
    
    private Long id;
    
    private Date createAt;
    
    private String createBy;
    
    private Date updateAt;
    
    private String updateBy;
    
    private String productCode;
    
    private String productName;
    /**
    * 价格
    */
    private Double price;
    /**
    * 单位
    */
    private String unit;
    /**
    * 备注
    */
    private String remarks;


}