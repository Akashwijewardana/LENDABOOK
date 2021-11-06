package com.example.assignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.assignment.model.BookCategory;
import com.example.assignment.service.BookCategoryService;

public interface BookCatogeryRepo extends CrudRepository<BookCategory, Integer>{

	

}
