package com.example.relations.service;

import com.example.relations.entity.Course;
import com.example.relations.repositary.CourseRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepositary repo;
    public Course save(Course course) {
        return repo.save(course);
    }

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    public Course getCourseById(Long id) {
        return repo.findById(id).get();
    }
}