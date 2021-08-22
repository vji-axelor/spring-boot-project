package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CourseDao;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private CourseDao courseDao;
	
	@GetMapping("/test")
	public String test() {
		return "Spring Boot test";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
//		return this.courseService.getAllCources();
		return this.courseDao.findAll();
	}
	
	@GetMapping("/course/{id}")
	public Course getSinglrCourse(@PathVariable String id) {
		
		return this.courseService.getSingleCourse(Long.parseLong(id));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
//		return this.courseService.addCourse(course);
		
		return this.courseDao.save(course);
	}
}
