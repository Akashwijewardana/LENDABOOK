package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.BookCategory;
import com.example.assignment.model.VideoCatogery;
import com.example.assignment.service.VideoategoryService;

@RestController
public class VideoCatogeryController {

@Autowired
private VideoategoryService videoategoryService;

@RequestMapping(method = RequestMethod.POST,value = "/savevideocatgorey")
public void saveVideoCatogery(@RequestBody VideoCatogery videoCatogery) {
	videoategoryService.save(videoCatogery);
}

@RequestMapping("/getallvideocatogery")
public List<VideoCatogery> getAll(){
	return videoategoryService.getAll();
}

@RequestMapping(method = RequestMethod.PUT,value = "/updatevideocatogery/{id}")
public void upateVideoCatogery(@PathVariable Integer id,@RequestBody VideoCatogery videoCatogery) {
	videoategoryService.update(id,videoCatogery);
}

@RequestMapping(method = RequestMethod.DELETE, value = "/deletevideocatogery/{id}")
public void deleteVideoCatogery(@PathVariable Integer id) {
	videoategoryService.delete(id);
}
}
