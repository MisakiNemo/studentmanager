package com.example.demo.service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public void addStudent(Student student){
        studentMapper.insert(student);
    }

    @Override
    public List<Student> getAllStudent(){
        System.out.println("getAllStudent");
        return studentMapper.selectList(null);
    }

    @Override
    public void updateStudent(Student student){
        studentMapper.updateById(student);
    }


    @Override
    public void deleteStudent(Integer id){
        studentMapper.deleteById(id);
    }


    @Override
    public Student getStudentById(Integer id){
        return studentMapper.selectById(id);
    }




}
