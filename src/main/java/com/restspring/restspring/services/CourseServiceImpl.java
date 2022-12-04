package com.restspring.restspring.services;

import com.restspring.restspring.dao.CourseDao;
import com.restspring.restspring.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private final CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourseById(long courseId) {
        return courseDao.getReferenceById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.save(course);
    }

    @Override
    public void deleteCourseById(long courseId) {
        Course entity = courseDao.getReferenceById(courseId);
        courseDao.delete(entity);
    }
}
