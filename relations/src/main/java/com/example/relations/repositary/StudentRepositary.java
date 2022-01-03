package com.example.relations.repositary;

import com.example.relations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student, Long> {
}
