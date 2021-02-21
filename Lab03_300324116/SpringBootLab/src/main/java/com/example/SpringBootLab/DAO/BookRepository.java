package com.example.SpringBootLab.DAO;

import com.example.SpringBootLab.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface BookRepository extends MongoRepository<Book,Integer> {

//    Collection<Book> findAll();
//
//    Book insert(Book book);
}
