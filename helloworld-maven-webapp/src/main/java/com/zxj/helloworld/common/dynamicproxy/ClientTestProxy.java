package com.zxj.helloworld.common.dynamicproxy;

public class ClientTestProxy {
    public static void main(String[] args) {
        //保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Subject subject=new JDKDynamicProxy(new SubjectImp()).getProxy();
        subject.doSomething();
    }
}
