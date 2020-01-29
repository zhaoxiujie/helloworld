package com.zxj.helloworld.mvcapp.export.vo;

import lombok.Data;

/**
 * customer类信息
 */
@Data
public class CustomerVO {
    private Integer id;
    private String name;
    private String address;
    private String phone;
}
