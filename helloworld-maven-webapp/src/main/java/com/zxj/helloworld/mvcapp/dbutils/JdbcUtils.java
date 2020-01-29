package com.zxj.helloworld.mvcapp.dbutils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * JDBC的操作类
 */
public class JdbcUtils {
    //数据源
    private static DataSource dataSource=null;
    static {
        dataSource=new ComboPooledDataSource("helloworld");
    }
    /**
     * 获取数据源的一个Connection
     * @return
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 释放Connection连接
     * @param connection
     */
    public static void releaseConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
