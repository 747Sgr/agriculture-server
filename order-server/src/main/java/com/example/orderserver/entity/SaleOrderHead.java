package com.example.orderserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (SaleOrderHead)实体类
 *
 * @author makejava
 * @since 2021-09-06 20:34:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SaleOrderHead implements Serializable {
    private static final long serialVersionUID = -42650844719274337L;
    
    private Long id;
    
    private Date createAt;
    
    private String createBy;
    
    private Date updateAt;
    
    private String updateBy;
    
    private String orderNumber;
    
    private Long lineId;
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