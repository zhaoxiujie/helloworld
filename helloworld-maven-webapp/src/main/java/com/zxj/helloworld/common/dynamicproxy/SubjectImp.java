package com.zxj.helloworld.common.dynamicproxy;

public class SubjectImp implements Subject{
    @Override
    public void doSomething() {
        System.out.println("Do something.");
    }
}
