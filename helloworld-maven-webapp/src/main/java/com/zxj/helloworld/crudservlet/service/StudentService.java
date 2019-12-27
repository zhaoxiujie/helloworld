package com.zxj.helloworld.crudservlet.service;

import com.zxj.helloworld.crudservlet.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentInfoById(String studentId);

    int getStudentNumByParam(Student student);

    boolean deleteStudentById(String studentId);

    boolean insertStudent(Student student);
}
