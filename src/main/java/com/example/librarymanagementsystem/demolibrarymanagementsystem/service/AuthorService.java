package com.example.librarymanagementsystem.demolibrarymanagementsystem.service;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Author;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public Author createOrGetAuthor(Author author) {
        Author authorFromDb = authorRepository.findAuthor(author.getEmail());

        if(authorFromDb == null) {
            authorFromDb = authorRepository.save(author);
        }
        return authorFromDb;
    }
}
