package com.example.librarymanagementsystem.demolibrarymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "author")
    @JsonIgnoreProperties(value = "author")
    private List<Book> books;

    private int age;

    @Column(unique = true, nullable = false)
    private String email;
}
