package com.example.assignment.service;

import java.util.List;
import java.util.Optional;


import com.example.assignment.model.VideoCatogery;

public interface VideoategoryService {

	List<VideoCatogery> getAll();

	void save(VideoCatogery videoCatogery);

	public Optional<VideoCatogery> update(Integer integer, VideoCatogery videoCatogery);

	void delete(Integer id);

	public VideoCatogery getByID(Integer id);
}
