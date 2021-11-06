package com.example.assignment.service;

import java.util.List;
import java.util.Optional;

import com.example.assignment.model.Book;
import com.example.assignment.model.BookCategory;

public interface BookService {

	void save(Book book);

	List<Book> getAll();

	public Optional<Book> update(Integer integer, Book book);

	void delete(Integer id);

	public Book getByID(Integer id);
}
