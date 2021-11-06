package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.Book;
import com.example.assignment.model.BookCategory;
import com.example.assignment.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	

	@RequestMapping(method = RequestMethod.POST,value = "/savebook")
	public void saveBook(@RequestBody Book book) {
		bookService.save(book);
	}
	
	@RequestMapping("/getallbook")
	public List<Book> getAll(){
		return bookService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatebook/{id}")
	public void upateBook(@PathVariable Integer id,@RequestBody Book book) {
		bookService.update(id,book);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletebook/{id}")
	public void deleteBookCatogery(@PathVariable Integer id) {
		bookService.delete(id);
	}
}
