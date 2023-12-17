package com.example.librarymanagementsystem.demolibrarymanagementsystem.requestmodels;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Author;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Category;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookCreateRequest {

    private String name;

    private int cost;

    private String authorName;

    private Category category;

    private String email;


    public Book to() {

        Author author = Author.builder()
                .name(authorName)
                .email(email)
                .build();

        return Book.builder()
                .name(name)
                .category(category)
                .cost(cost)
                .author(author)
                .build();
    }

}
