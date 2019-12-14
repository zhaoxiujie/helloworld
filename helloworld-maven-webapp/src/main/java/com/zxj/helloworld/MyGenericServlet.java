package com.zxj.helloworld;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public abstract class MyGenericServlet implements Servlet,ServletConfig {

    private ServletConfig servletConfig;

    public MyGenericServlet(){}

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
        this.init();
    }

    public void init() throws ServletException { }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public abstract void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException ;

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }

    //region  ServletConfig接口的方法

    @Override
    public String getServletName() {
        return servletConfig.getServletName();
    }

    @Override
    public ServletContext getServletContext() {
        return servletConfig.getServletContext();
    }

    @Override
    public String getInitParameter(String s) {
        return servletConfig.getInitParameter(s);
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return servletConfig.getInitParameterNames();
    }

    //endregion
}
