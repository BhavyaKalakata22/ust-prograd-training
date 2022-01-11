package com.example.relations.service;

import com.example.relations.entity.Student;
import com.example.relations.repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepositary repo;

    public List<Student> getAllStudents() {

        return repo.findAll();
    }

    public Student save(Student student) {

        return repo.save(student);
    }

    public Student getStudentById(Long studentId) {

        return repo.findById(studentId).get();
    }
}
