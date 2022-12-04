package com.restspring.restspring.services;

import com.restspring.restspring.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    Course getCourseById(long courseId);

    Course addCourse(Course course);

    void updateCourse(Course course);

    void deleteCourseById(long courseId);
}
