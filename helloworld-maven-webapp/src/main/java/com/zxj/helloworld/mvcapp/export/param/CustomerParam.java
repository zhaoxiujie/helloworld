package com.zxj.helloworld.mvcapp.export.param;

import lombok.Data;

/**
 * 查询customer信息入参
 */
@Data
public class CustomerParam {
    /**
     * customerId
     */
    private Integer customerId;

    /**
     * customerName
     */
    private String customerName;
}
