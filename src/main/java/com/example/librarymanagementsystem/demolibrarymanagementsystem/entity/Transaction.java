package com.example.librarymanagementsystem.demolibrarymanagementsystem.entity;


import com.example.librarymanagementsystem.demolibrarymanagementsystem.requestmodels.TransactionStatus;
import com.example.librarymanagementsystem.demolibrarymanagementsystem.requestmodels.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String transactionId;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "transaction")
    private Student student;

    @Enumerated(value = EnumType.STRING)
    TransactionType transactionType;

    @Enumerated(value = EnumType.STRING)
    TransactionStatus transactionStatus;

    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties(value = "transaction")
    private Book book;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedDate;

    private Integer fine;

}
