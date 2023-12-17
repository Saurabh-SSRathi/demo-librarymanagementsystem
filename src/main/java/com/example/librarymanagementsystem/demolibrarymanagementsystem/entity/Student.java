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
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true)
    private String phoneNumber;

    @OneToMany(mappedBy = "student")
    @JsonIgnoreProperties(value = "student")
    private List<Book> books;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedDate;

    @OneToMany(mappedBy = "student")
    @JsonIgnoreProperties(value = "student")
    private List<Transaction> transaction;
}
