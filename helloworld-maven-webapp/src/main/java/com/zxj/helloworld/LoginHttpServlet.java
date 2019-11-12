package com.zxj.helloworld;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * LoginHttpServlet
 * HttpServletRequest类的方法
 */
public class LoginHttpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestMethod = request.getMethod();//请求方式
        String requestURI=request.getRequestURI(); //URI:/loginHttpServlet;
        String servletPath= request.getServletPath();
        StringBuffer requestURLStringBuffer=request.getRequestURL();
        String requestUrl=requestURLStringBuffer.toString();//URL:http://localhost:8080/loginHttpServlet
        System.out.println("requestMethod:"+requestMethod+";\nrequestURI:"+requestURI+";\nservletPath:"+servletPath+";\nrequestUrl:"+requestUrl);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestMethod = request.getMethod();
        String queryString=request.getQueryString();
    }
}
