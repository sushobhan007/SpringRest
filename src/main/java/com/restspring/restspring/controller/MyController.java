package com.restspring.restspring.controller;

import com.restspring.restspring.entities.Course;
import com.restspring.restspring.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId) {
        return courseService.getCourseById(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public ResponseEntity<HttpStatus> updateCourse(@RequestBody Course course) {
        try {
            courseService.updateCourse(course);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable long courseId){
        courseService.deleteCourseById(courseId);
    }

}
