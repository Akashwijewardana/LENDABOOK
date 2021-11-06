package com.example.assignment.service;

import java.util.List;
import java.util.Optional;

import com.example.assignment.model.Video;


public interface VideoService {

	void save(Video video);

	List<Video> getAll();

	public Optional<Video> update(Integer integer, Video video);

	void delete(Integer id);
	public Video getByID(Integer id);

}
