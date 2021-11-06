package com.example.assignment.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.model.BookCategory;
import com.example.assignment.model.VideoCatogery;
import com.example.assignment.repository.VideoCatogreyRepo;
import com.example.assignment.service.VideoategoryService;
@Service
public class VideoCatogeryImpl implements VideoategoryService {
	
	@Autowired
	private VideoCatogreyRepo videoCatogreyRepo;

	@Override
	public List<VideoCatogery> getAll() {
		List<VideoCatogery> vcatList = new ArrayList<VideoCatogery>();
		videoCatogreyRepo.findAll().forEach(vcatList::add);
		return vcatList;
	}

	@Override
	public void save(VideoCatogery videoCatogery) {
		videoCatogreyRepo.save(videoCatogery);
		
	}

	@Override
	@Transactional
	public Optional<VideoCatogery> update(Integer integer, VideoCatogery videoCatogery) {
		return videoCatogreyRepo.findById(integer).map(e -> {
			e.setName(videoCatogery.getName());
			return e;
		});
	}

	@Override
	public void delete(Integer id) {
		videoCatogreyRepo.deleteById(id);
		
	}

	@Override
	public VideoCatogery getByID(Integer id) {
		Optional<VideoCatogery> vclist = Optional.ofNullable(videoCatogreyRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		VideoCatogery videoCategory =vclist.get();
		return videoCategory;
	}

}
