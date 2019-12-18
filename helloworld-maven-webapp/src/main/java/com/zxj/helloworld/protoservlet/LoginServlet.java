package com.zxj.helloworld.protoservlet;


import javax.servlet.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Servlet接口 --- ServletRequest对象的方法调用
 */
public class LoginServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("This is service method in LoginServlet.");

        //region servletRequest.getParameter(String paramName);
        String userName =  servletRequest.getParameter("userName");
        String password =  servletRequest.getParameter("password");
        System.out.println("servletRequest.getParameter()-->"+userName+":"+password);
        //endregion

        //region servletRequest.getParameterValues(String paramName) 可在获取多选框的值时使用
        String[] interests = servletRequest.getParameterValues("interests");
        for (String interest:interests){
            System.out.println(interest);
        }
        //endregion

        //region servletRequest.getParameterNames()
        Enumeration<String> requestParams=servletRequest.getParameterNames();
        while (requestParams.hasMoreElements()){
            String requestParam=requestParams.nextElement();
            String requestParamValue=servletRequest.getParameter(requestParam);
            System.out.println(requestParam+":"+requestParamValue);
        }
        //endregion

        //region servletRequest.getParameterMap()  + Map的遍历
        Map<String,String[]> requestParameterMap= servletRequest.getParameterMap();
        if (null!=requestParameterMap){

            //遍历Map
            //region  方法一
            Set<String> keys = requestParameterMap.keySet();
            for (String key :keys){
                String[] values=requestParameterMap.get(key);
                StringBuilder builder=new StringBuilder();
                builder.append("servletRequest.getParameterMap()-->").append(key)
                        .append(":");
                for (String value :values){
                    builder.append(value).append("、");
                }
                System.out.println(builder.toString().substring(0,builder.toString().length()-1));
            }
            //endregion

            //region 方法二
            for (Map.Entry<String,String[]> entry:requestParameterMap.entrySet()){
                System.out.println(entry.getKey()+":"+ Arrays.asList(entry.getValue()));
            }
            //endregion
        }
        //endregion

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
