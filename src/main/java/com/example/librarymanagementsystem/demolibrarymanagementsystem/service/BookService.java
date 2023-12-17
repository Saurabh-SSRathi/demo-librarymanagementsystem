package com.example.librarymanagementsystem.demolibrarymanagementsystem.service;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Author;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepo;

    @Autowired
    AuthorService authorService;

    public void createBook(Book book) {

        Author author = authorService.createOrGetAuthor(book.getAuthor());
        book.setAuthor(author);
        bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public void updateBook(Book book) {
        bookRepo.save(book);
    }

    public Book getBookById(int bookId) {
        return bookRepo.findById(bookId).orElse(null);
    }
}
