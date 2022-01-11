package com.example.relations.service;

import com.example.relations.entity.Faculty;
import com.example.relations.repositary.FacultyRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepositary repo;

    public List<Faculty> getAllFaculties() {
        return repo.findAll();
    }

    public Faculty save(Faculty faculty) {
        return repo.save(faculty);
    }

    public Faculty getFacultyById(Long facultyId) {
        return repo.findById(facultyId).get();
    }
}
