package com.example.librarymanagementsystem.demolibrarymanagementsystem.repository;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
