package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.Video;
import com.example.assignment.model.VideoCatogery;
import com.example.assignment.service.VideoService;
import com.example.assignment.service.VideoategoryService;

@RestController
public class VideoController {

	@Autowired
	private VideoService videoService;
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/savevideo")
	public void saveVideo(@RequestBody Video video) {
		videoService.save(video);
	}

	@RequestMapping("/getallvideo")
	public List<Video> getAll(){
		return videoService.getAll();
	}

	@RequestMapping(method = RequestMethod.PUT,value = "/updatevideo/{id}")
	public void upateVideo(@PathVariable Integer id,@RequestBody Video videoCatogery) {
		videoService.update(id,videoCatogery);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deletevideo/{id}")
	public void deleteVideo(@PathVariable Integer id) {
		videoService.delete(id);
	}
}
