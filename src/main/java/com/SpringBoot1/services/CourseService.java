package com.SpringBoot1.services;

import com.SpringBoot1.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourses();
   // public Course getCourse(Long id);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parselong);

    public Optional<Course> findById(Long Id);
}
