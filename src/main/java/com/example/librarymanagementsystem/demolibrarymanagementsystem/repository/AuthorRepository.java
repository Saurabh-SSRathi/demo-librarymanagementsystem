package com.example.librarymanagementsystem.demolibrarymanagementsystem.repository;

import com.example.librarymanagementsystem.demolibrarymanagementsystem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

 /*  //JPQL Way
    @Query(value = "select a from Author a where a.id=:id")
    Author findAuthor(int id);

    //is native query way
    @Query(value = "select * from author where email=:email", nativeQuery = true)
    Author findAuthor(String email);

    //suppose if the query has multiple parameter
    @Query(value = "select a from Author a where a.name=:name and a.email = :email")
    Author findAuthorByNameAndEmail(String name, String email);
*/

    @Query(value = "select a from Author a where a.email = :email")
    Author findAuthor(String email);

}

