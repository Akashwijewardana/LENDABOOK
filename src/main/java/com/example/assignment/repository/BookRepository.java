package com.example.assignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.assignment.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
