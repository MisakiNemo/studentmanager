package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {


    List<Student> getAllStudent();

    void updateStudent(Student student);


    void addStudent(Student student);

    void deleteStudent(Integer id);

    Student getStudentById(Integer id);
}
