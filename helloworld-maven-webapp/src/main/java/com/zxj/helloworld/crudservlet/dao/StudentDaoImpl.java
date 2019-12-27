package com.zxj.helloworld.crudservlet.dao;

import com.zxj.helloworld.crudservlet.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getAllStudents() {
        List<Student> students=new ArrayList<>();
        System.out.println("StudentDao.getAllStudents");
        return students;
    }

    @Override
    public Student getStudentInfoById(String studentId) {
        Student student=new Student();
        System.out.println("StudentDao.getStudentInfoById");
        return null;
    }

    @Override
    public int getStudentNumByParam(Student student) {
        System.out.println("StudentDao.getStudentNumByParam");
        return 0;
    }

    @Override
    public boolean deleteStudentById(String studentId) {
        System.out.println("StudentDao.deleteStudentById");
        return false;
    }

    @Override
    public boolean insertStudent(Student student) {
        System.out.println("StudentDao.insertStudent");
        return false;
    }
}
