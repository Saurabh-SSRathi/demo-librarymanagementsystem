package com.example.librarymanagementsystem.demolibrarymanagementsystem.controllers;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.requestmodels.BookCreateRequest;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    /*{
"name":"Maths 212",
"cost":400,
"authorName": "JK ROWLING 21",
"category":"ACCOUNTS",
"email":"william@gmail.com"
}*/

    @PostMapping("/book")
    public void createBook(@RequestBody BookCreateRequest bookCreateRequest) {
        bookService.createBook(bookCreateRequest.to());
    }

    @GetMapping("/book/all")
    public List<Book> getBook() {
        return bookService.getAllBooks();
    }

    @PutMapping("/book/update")
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @GetMapping("book/{bookId}")
    public Book getBook(@PathVariable("bookId") int bookId) {
        return bookService.getBookById(bookId);
    }
}

//Authentication - will check that yje given user is valid or not
//Authorization -  means you may be a valid user but you don't have access to certain operation or access a file etc.


