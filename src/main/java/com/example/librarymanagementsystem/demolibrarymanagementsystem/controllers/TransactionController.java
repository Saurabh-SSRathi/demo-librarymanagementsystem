package com.example.librarymanagementsystem.demolibrarymanagementsystem.controllers;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    //we want to issue the book and return the book

    //issue book

    @PostMapping("/transaction/issue")
    public String issueBook(@RequestParam("bookId") int bookId, @RequestParam("studentId") int studentId) throws Exception {
        return transactionService.issueBook(bookId, studentId);
    }

    @PostMapping("/transaction/return")
    public String returnBook(@RequestParam("bookId") int bookId, @RequestParam("studentId") int studentId) throws Exception {
        return transactionService.returnBook(bookId, studentId);
    }




}
