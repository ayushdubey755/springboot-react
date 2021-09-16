package com.springrest.springrest.services;

import java.util.List;


import com.springrest.springrest.entities.Courses;

public interface CourseService {

	public List<Courses> getCourses();

	public Courses getCourseById(long courseId);
	
	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);

	public void deleteCourse(long parseLong);
}
