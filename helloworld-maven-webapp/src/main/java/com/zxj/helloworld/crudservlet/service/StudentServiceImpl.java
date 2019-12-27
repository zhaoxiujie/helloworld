package com.zxj.helloworld.crudservlet.service;

import com.zxj.helloworld.crudservlet.dao.StudentDao;
import com.zxj.helloworld.crudservlet.dao.StudentDaoImpl;
import com.zxj.helloworld.crudservlet.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudentInfoById(String studentId) {
        return studentDao.getStudentInfoById(studentId);
    }

    @Override
    public int getStudentNumByParam(Student student) {
        return studentDao.getStudentNumByParam(student);
    }

    @Override
    public boolean deleteStudentById(String studentId) {
        return studentDao.deleteStudentById(studentId);
    }

    @Override
    public boolean insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }
}
