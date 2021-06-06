package com.university.Repositories;

import com.university.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    Book findById(int id);
    Book findByName(String name);
    Book getOne(int id);
}
