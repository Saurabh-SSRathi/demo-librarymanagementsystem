package com.example.librarymanagementsystem.demolibrarymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int cost;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    private String isbn;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "books") // to ignore load books from author
    private Author author;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedDate;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "books")
    private Student student;

    @OneToMany(mappedBy = "book")
    @JsonIgnoreProperties(value = "book")
    private List<Transaction> transaction;

}