package com.example.jpademo.service;

import com.example.jpademo.entity.Student;

import com.example.jpademo.repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepositary repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }


    public List<Student> listAll() {
        return repository.findAll();
    }
}


