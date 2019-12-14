package com.zxj.helloworld.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginMyGenericServlet extends MyGenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("This is service method in LoginMyGenericServlet.");

        //region 获取前端页面请求过来的参数 servletRequest.getParameter(String paramName);
        String userName = servletRequest.getParameter("userName");
        String password = servletRequest.getParameter("password");
        System.out.println("servletRequest.getParameter()-->" + userName + ":" + password);
        //endregion

        //region 获取web.xml中配置的全局参数  即context-param中的键值对
        String initUserName = getServletContext().getInitParameter("username");
        String initPassword = getServletContext().getInitParameter("password");
        System.out.println("context-param-->" + initUserName + ":" + initPassword);
        //endregion

        PrintWriter writer=servletResponse.getWriter();

        if (userName.equals(initUserName) && password.equals(initPassword)) {
            writer.println("Hello,"+userName+"!");
        }else {
            writer.println("Sorry");
        }
    }
}
