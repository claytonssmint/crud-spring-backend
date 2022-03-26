package com.clayton.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.clayton.model.Course;
import com.clayton.repository.CourseRepository;


@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	
	private CourseRepository courseRepository;	


	public CourseController(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}


	@GetMapping
	public @ResponseBody List<Course> list(){
		return courseRepository.findAll();
	}

}
