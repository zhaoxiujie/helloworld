package com.zxj.helloworld;


import javax.servlet.*;
import java.io.IOException;

public class LifeCycleServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("LifeCycleServlet's init...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("LifeCycleServlet's service...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleServlet's destroy...");
    }

    public LifeCycleServlet(){
        System.out.println("LifeCycleServlet's constructor...");
    }
}
