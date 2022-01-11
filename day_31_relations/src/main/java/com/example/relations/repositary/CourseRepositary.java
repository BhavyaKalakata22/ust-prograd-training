package com.example.relations.repositary;

import com.example.relations.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepositary extends JpaRepository<Course, Long> {
}