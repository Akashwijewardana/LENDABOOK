package com.example.assignment.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.model.Book;
import com.example.assignment.model.BookCategory;
import com.example.assignment.repository.BookRepository;
import com.example.assignment.service.BookService;

@Service
public class BookImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void save(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public List<Book> getAll() {
		List<Book> bookcatList = new ArrayList<Book>();
		bookRepository.findAll().forEach(bookcatList::add);
		return bookcatList;
	}

	@Transactional
	@Override
	public Optional<Book> update(Integer integer, Book book) {
		return bookRepository.findById(integer).map(e -> {
			e.setName(book.getName());
			e.setAuthor(book.getAuthor());
			e.setCopies(book.getCopies());
			e.setIsbn(book.getIsbn());
			e.setPrice(book.getPrice());
			
			return e;
		});
	}

	@Override
	public void delete(Integer id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public Book getByID(Integer id) {
		Optional<Book> bclist = Optional.ofNullable(bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Book book =bclist.get();
		return book;
	}

}
