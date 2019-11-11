package com.zxj.helloworld;


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


        //region web.xml中配置的 init-params节点
        String userConfigValue=servletConfig.getInitParameter("user");
        System.out.println("user:"+userConfigValue);

        Enumeration<String> parameterNames = servletConfig.getInitParameterNames();
        while (parameterNames.hasMoreElements()){
            String parameterName=parameterNames.nextElement();
            String parameterValue=servletConfig.getInitParameter(parameterName);
            System.out.println("config name:"+parameterName+";config value:"+parameterValue);
        }
        //endregion


        //region ServletContext 对象
        ServletContext servletContext=servletConfig.getServletContext();


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
