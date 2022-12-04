package com.restspring.restspring.dao;

import com.restspring.restspring.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
