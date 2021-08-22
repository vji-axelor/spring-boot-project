package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	public List<Course> courses;
	
	public CourseServiceImpl() {
	courses = new ArrayList<Course>();
	courses.add(new Course(1, "First course", "First course description"));
	courses.add(new Course(2, "Second course", "Second course description"));

	}
	
	
	@Override
	public List<Course> getAllCources() {
		return courses;
	}


	@Override
	public Course getSingleCourse(long id) {
		
		for(Course course : courses) {
			if(course.getId() == id) {
				return course;
			}
		}
		
		return null;
	}


	@Override
	public Course addCourse(Course course) {
		courses.add(course);
		return course;
	}

}
