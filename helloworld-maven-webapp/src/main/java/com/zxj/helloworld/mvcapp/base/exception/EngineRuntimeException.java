package com.zxj.helloworld.mvcapp.base.exception;

import lombok.Data;

@Data
public class EngineRuntimeException extends RuntimeException {
    private String message;
    private String code;
}
