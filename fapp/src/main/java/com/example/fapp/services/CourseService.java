package com.example.fapp.services;

import java.util.List;

import com.example.fapp.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public Course deleteCourse(long parseLong);
}
