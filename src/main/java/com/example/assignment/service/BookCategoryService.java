package com.example.assignment.service;



import java.util.List;
import java.util.Optional;

import com.example.assignment.model.BookCategory;

public interface BookCategoryService {

	void save(BookCategory bookCategory);

	List<BookCategory> getAll();
	
	public BookCategory getByID(Integer id);

	public Optional<BookCategory> update(Integer integer, BookCategory bookCategory);

	void delete(Integer id);

	

}
