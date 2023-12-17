package com.example.librarymanagementsystem.demolibrarymanagementsystem.repository;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
