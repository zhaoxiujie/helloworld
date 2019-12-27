package com.zxj.helloworld.crudservlet.model;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int Id;
    private String name;
    private int age;
    private float grade;
    private List<String> intests;

    public Student(int id, String name, int age, float grade, List<String> intests) {
        Id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.intests = intests;
    }

    public Student() {
    }
}
