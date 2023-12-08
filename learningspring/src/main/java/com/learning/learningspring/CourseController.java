package com.learning.learningspring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/returncourse")
	public List<CourseDetails> retriveCourses(){
		return Arrays.asList( 
				new CourseDetails(1, "java","youtube"),
				new CourseDetails(2, "shell"," youtube"),
				new CourseDetails(3, "c++", "youtube")
				);
		
	}
}
