package com.zxj.helloworld.crudservlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId=request.getParameter("id");
        System.out.println("studentId:"+Integer.parseInt(studentId));
        request.getRequestDispatcher("/success.jsp").forward(request,response);
    }
}
