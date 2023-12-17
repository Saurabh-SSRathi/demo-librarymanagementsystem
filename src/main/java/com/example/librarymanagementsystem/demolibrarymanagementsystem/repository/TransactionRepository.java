package com.example.librarymanagementsystem.demolibrarymanagementsystem.repository;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Student;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Transaction;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.requestmodels.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction, Integer> {

    List<Transaction> findByBookAndStudentAndTransactionTypeOrderByIdDesc(Book book, Student student,
                                                                          TransactionType transactionType);
}
