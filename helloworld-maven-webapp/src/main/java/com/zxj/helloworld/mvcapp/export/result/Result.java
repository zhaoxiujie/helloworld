package com.zxj.helloworld.mvcapp.export.result;

import lombok.Data;

@Data
public class Result<T> {
    private String resultCode;
    private String message;
    private T resultInfo;
}
