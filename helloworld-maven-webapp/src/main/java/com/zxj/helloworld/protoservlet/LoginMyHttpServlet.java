package com.zxj.helloworld.protoservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginMyHttpServlet extends MyHttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("This is service method in LoginMyHttpServlet.");

        //region 获取前端页面请求过来的参数 servletRequest.getParameter(String paramName);
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.out.println("servletRequest.getParameter()-->" + userName + ":" + password);
        //endregion

        //region 获取web.xml中配置的全局参数  即context-param中的键值对
        String initUserName = getServletContext().getInitParameter("username");
        String initPassword = getServletContext().getInitParameter("password");
        System.out.println("context-param-->" + initUserName + ":" + initPassword);
        //endregion

        PrintWriter writer=response.getWriter();

        if (userName.equals(initUserName) && password.equals(initPassword)) {
            writer.println("Hello,"+userName+"!");
        }else {
            writer.println("Sorry");
        }
    }
}
