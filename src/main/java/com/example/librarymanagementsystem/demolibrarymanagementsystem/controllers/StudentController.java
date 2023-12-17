package com.example.librarymanagementsystem.demolibrarymanagementsystem.controllers;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Student;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @GetMapping("/student/all")
    public List<Student> getStudent() {
        return studentService.getAllStudents();
    }

    @PutMapping("/student/update")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @GetMapping("student/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId) {
        return studentService.getStudentsById(studentId);
    }
}
