package com.zxj.helloworld.mvcapp.export.param;

import lombok.Data;

/**
 * customer信息变更入参
 */
@Data
public class CustomerChangeParam {
    /**
     * id
     */
    private Integer customerId;

    /**
     * name
     */
    private String customerName;

    /**
     * address
     */
    private String customerAddress;

    /**
     * phone
     */
    private String customerPhone;
}
