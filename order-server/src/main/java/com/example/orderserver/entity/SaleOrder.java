package com.example.orderserver.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SaleOrder)实体类
 *
 * @author makejava
 * @since 2021-08-02 19:54:11
 */
@Data
public class SaleOrder implements Serializable {
    private static final long serialVersionUID = 787977098714731925L;
    
    private Long id;
    
    private Date createAt;
    
    private String creaateBy;
    
    private Date updateAt;
    
    private String updateBy;
    
    private String ordernumber;
    
    private Long lineid;
    /**
    * 总数
    */
    private Double total;
    /**
    * 总价
    */
    private Double totalPrice;
    /**
    * 备注
    */
    private String remarks;


}