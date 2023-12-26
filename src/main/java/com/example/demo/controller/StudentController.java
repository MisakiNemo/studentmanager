package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;




    @GetMapping("/students")
    public List<Student> get() {
        return studentService.getAllStudent();
    }

    /*更新学生数据*/
    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        student.setId(id);
        studentService.updateStudent(student);

    }

/*添加学生数据*/
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    /*删除学生数据*/
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }

    /*根据id查询学生数据*/
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }





}
