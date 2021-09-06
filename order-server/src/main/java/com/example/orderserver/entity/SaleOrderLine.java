package com.example.orderserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (SaleOrderLine)实体类
 *
 * @author makejava
 * @since 2021-09-06 20:34:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SaleOrderLine implements Serializable {
    private static final long serialVersionUID = 858105721791402865L;
    
    private Long id;
    
    private Date createAt;
    
    private String createBy;
    
    private Date updateAt;
    
    private String updateBy;
    
    private Long productId;
    /**
    * 数量
    */
    private Double quantity;
    /**
    * 单价
    */
    private Double price;
    
    private String remarks;

    private String productName;


}