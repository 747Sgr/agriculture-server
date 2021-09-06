package com.example.productserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2021-09-06 21:20:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Serializable {
    private static final long serialVersionUID = -42490862077481811L;

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