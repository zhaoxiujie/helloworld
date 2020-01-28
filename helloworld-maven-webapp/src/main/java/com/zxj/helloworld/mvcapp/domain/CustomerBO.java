package com.zxj.helloworld.mvcapp.domain;

import lombok.Data;

@Data
public class Customer {
    private Integer id;
    private String name;
    private String address;
    private String phone;
}
