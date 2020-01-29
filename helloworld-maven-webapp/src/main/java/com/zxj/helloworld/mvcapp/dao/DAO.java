package com.zxj.helloworld.mvcapp.dao;

import java.util.List;

/**
 * 封装了基本的CRUD方法，以供子类继承使用
 * 当前DAO直接在方法中获取数据库连接
 * 整个DAO采用DBUitls解决方案
 * @param <T> 当前DAO处理的实体类型
 */
public class DAO<T> {
    private Class<T> clazz;

    /**
     * 返回某一个字段的值
     * @param sql
     * @param args
     * @param <E>
     * @return
     */
    public <E> E getForValue(String sql,Object ... args){
        return null;
    }

    /**
     * 返回 T 所对应的类的List
     * @param sql
     * @param args
     * @return
     */
    public List<T> getForList(String sql,Object ... args){
        return null;
    }

    /**
     * 返回 T 的一个实体类
     * @param sql
     * @param args
     * @return
     */
    public T get(String sql,Object ... args){
        return null;
    }

    /**
     * 封装了insert、delete、update操作
     * @param sql SQL语句
     * @param args 填充SQL语句的占位符
     */
    public void update(String sql,Object ... args){

    }
}
