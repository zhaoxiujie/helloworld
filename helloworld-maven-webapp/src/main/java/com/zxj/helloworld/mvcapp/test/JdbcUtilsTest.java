package com.zxj.helloworld.mvcapp.test;

import com.zxj.helloworld.mvcapp.dbutils.JdbcUtils;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 单元测试类
 */
public class JdbcUtilsTest {
    @Test
    public void testGetConnection() throws SQLException {
        JdbcUtils jdbcUtils=new JdbcUtils();
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
    }
}
