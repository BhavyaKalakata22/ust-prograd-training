package com.example.relations.repositary;

import com.example.relations.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepositary extends JpaRepository<Faculty, Long> {
}