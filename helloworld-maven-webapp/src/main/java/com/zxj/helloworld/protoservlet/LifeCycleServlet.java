package com.zxj.helloworld.protoservlet;


import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 1、Servlet接口主要的生命周期方法：
 *      > 构造器
 *      > init
 *      > service
 *      > destroy
 */
public class LifeCycleServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("LifeCycleServlet's init...");

        //region servletConfig.getServletName()为在web.xml中配置的 servlet-name节点值
        String servletName=servletConfig.getServletName();
        System.out.println("servletName:"+servletName);
        //endregion


        //region servletConfig对象 web.xml中配置的 init-params节点
        String userConfigValue=servletConfig.getInitParameter("user");
        System.out.println("user:"+userConfigValue);

        Enumeration<String> servletParamNames = servletConfig.getInitParameterNames();
        while (servletParamNames.hasMoreElements()){
            String servletParamName=servletParamNames.nextElement();
            String servletParamValue=servletConfig.getInitParameter(servletParamName);
            System.out.println(servletParamName+"--->"+servletParamValue);
        }
        //endregion


        //region ServletContext 对象:web.xml中配置的 context-params节点
        ServletContext servletContext=servletConfig.getServletContext();
        String driver=servletContext.getInitParameter("driver");
        System.out.println("driver:"+driver);

        Enumeration<String> contextParamNames=servletContext.getInitParameterNames();
        while (contextParamNames.hasMoreElements()){
            String contextParamName=contextParamNames.nextElement();
            String contextParamValue=servletContext.getInitParameter(contextParamName);
            System.out.println(contextParamName+"--->"+contextParamValue);
        }

        //endregion
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
