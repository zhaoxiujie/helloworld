package com.zxj.helloworld.crudservlet.controller;

import com.zxj.helloworld.crudservlet.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentControllerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList=new ArrayList<>();

        Student student1=new Student(1,"zxj",20,92, Arrays.asList("swimming","running","studying"));
        Student student2=new Student(2,"test",24,96, Arrays.asList("swimming","running","studying"));
        studentList.add(student1);
        studentList.add(student2);
        request.setAttribute("studentList",studentList);
        request.getRequestDispatcher("/studentlist.jsp").forward(request,response);
    }
}
