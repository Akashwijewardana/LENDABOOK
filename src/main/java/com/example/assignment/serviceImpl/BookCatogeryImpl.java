package com.example.assignment.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.model.BookCategory;
import com.example.assignment.repository.BookCatogeryRepo;
import com.example.assignment.service.BookCategoryService;
@Service
public class BookCatogeryImpl implements BookCategoryService {
	
	@Autowired
	private BookCatogeryRepo bookCatogeryRepo;

	@Override
	public void save(BookCategory bookCategory) {
		// TODO Auto-generated method stub
		bookCatogeryRepo.save(bookCategory);
		
	}

	@Override
	public List<BookCategory> getAll() {
		List<BookCategory> bookcatList = new ArrayList<BookCategory>();
		bookCatogeryRepo.findAll().forEach(bookcatList::add);
		return bookcatList;
	}

	@Override
	public BookCategory getByID(Integer id) {
		Optional<BookCategory> bclist = Optional.ofNullable(bookCatogeryRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		BookCategory bookCategory =bclist.get();
		return bookCategory;
	}
	

	@Override
	@Transactional
	public Optional<BookCategory> update(Integer integer, BookCategory bookCategory) {
		return bookCatogeryRepo.findById(integer).map(e -> {
			e.setName(bookCategory.getName());
			return e;
		});
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bookCatogeryRepo.deleteById(id);
	}

}
