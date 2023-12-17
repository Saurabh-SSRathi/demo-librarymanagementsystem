package com.example.librarymanagementsystem.demolibrarymanagementsystem.service;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Student;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void updateStudent(Student student) {
        // merge both create and update later
        studentRepo.save(student);
    }

    public Student getStudentsById(int studentId) {
        return studentRepo.findById(studentId).orElse(null);
    }
}
