package com.example.fapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fapp.data1.CourseData1;
import com.example.fapp.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseData1 courseData1;
	//List<Course> list;
	
	public CourseServiceImpl()
	{
//		list=new ArrayList<Course>();
//		list.add(new Course(1,"sayali","cse"));
//		list.add(new Course(2,"tabbu","IT"));
//		list.add(new Course(3,"apeksha","ENTC"));
		
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseData1.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		
//		Course c1=null;
//		
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c1=course;
//				break;
//			}
//		}
		//return c1;
		return courseData1.getOne(courseId);
	}
	
	@Override
	public Course addCourse(Course course) {
		
//		list.add(course);
//		return course;
		courseData1.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e ->{
//			if(e.getId() == course.getId()) {
//				e.setName(course.getName());
//				e.setDepartment(course.getDepartment());
//			}
//		});
//		return course;
		courseData1.save(course);
		return course;
	}
	@Override
	public Course deleteCourse(long parseLong) {
		
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity =courseData1.getOne(parseLong);
		courseData1.delete(entity);
		return null;
	}
	
	
	
}
