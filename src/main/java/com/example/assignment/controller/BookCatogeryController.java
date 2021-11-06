package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.BookCategory;
import com.example.assignment.service.BookCategoryService;

@RestController
public class BookCatogeryController {

	@Autowired
	private BookCategoryService bookCategoryService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savebookcatgorey")
	public void saveBookCatogery(@RequestBody BookCategory bookCategory) {
		bookCategoryService.save(bookCategory);
	}
	
	@RequestMapping("/getallbookcatogery")
	public List<BookCategory> getAll(){
		return bookCategoryService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatebookcatogery/{id}")
	public void upateBookCatogery(@PathVariable Integer id,@RequestBody BookCategory bookCategory) {
		bookCategoryService.update(id,bookCategory);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletebookcatogery/{id}")
	public void deleteBookCatogery(@PathVariable Integer id) {
		bookCategoryService.delete(id);
	}
}

