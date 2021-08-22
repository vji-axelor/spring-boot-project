package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Course;

public interface CourseService {
	
	List<Course> getAllCources();
	Course getSingleCourse(long id);
	Course addCourse(Course course);
}
