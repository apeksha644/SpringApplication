package com.example.fapp.data1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fapp.entities.Course;

public interface CourseData1 extends JpaRepository<Course, Long> {

}
