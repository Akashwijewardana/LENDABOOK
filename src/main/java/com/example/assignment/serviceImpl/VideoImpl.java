package com.example.assignment.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.model.Video;
import com.example.assignment.model.VideoCatogery;
import com.example.assignment.repository.VideoRepository;
import com.example.assignment.service.VideoService;
@Service
public class VideoImpl implements VideoService{

	@Autowired
	private VideoRepository videoRepository;
	
	@Override
	public void save(Video video) {
		// TODO Auto-generated method stub
		videoRepository.save(video);
		
	}

	@Override
	public List<Video> getAll() {
		List<Video> vcatList = new ArrayList<Video>();
		videoRepository.findAll().forEach(vcatList::add);
		return vcatList;
	}

	@Override
	@Transactional
	public Optional<Video> update(Integer integer, Video video) {
		return videoRepository.findById(integer).map(e -> {
			e.setName(video.getName());
			e.setAuther(video.getAuther());
			e.setCopies(video.getCopies());
			e.setPrice(video.getPrice());
			e.setRestrictions(video.getRestrictions());
			e.setVcatid(video.getVcatid());
			return e;
		});
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		videoRepository.deleteById(id);
	}

	@Override
	public Video getByID(Integer id) {
		// TODO Auto-generated method stub
		Optional<Video> vclist = Optional.ofNullable(videoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID")));
		Video video =vclist.get();
		return video;
	}

}
