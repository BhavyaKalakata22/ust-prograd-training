package com.example.relations.controller;

import com.example.relations.entity.Course;
import com.example.relations.entity.Faculty;
import com.example.relations.entity.Student;
import com.example.relations.service.CourseService;
import com.example.relations.service.FacultyService;
import com.example.relations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/students")
    public List<Student> list() {
        return service.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @GetMapping("/student/new") // localhost:3000/student/new?name=some&age=xx
    public Student create(HttpServletRequest request) {
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));

        Student student = new Student(name, age);
        return service.save(student);
    }

    @GetMapping("/student/{studentId}/assign-faculty/{facultyId}") // lh:3000/student/2/assign-faculty/3
    public Student assignFaculty(@PathVariable Long studentId, @PathVariable Long facultyId) {
        Student student = service.getStudentById(studentId);
        Faculty faculty = facultyService.getFacultyById(facultyId);

        student.setFaculty(faculty);
        return service.save(student);
    }

    @GetMapping("/student/{studentId}/add-course/{courseId}") // lh:3000/student/2/assign-faculty/3
    public Student addCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        Student student = service.getStudentById(studentId);
        Course course = courseService.getCourseById(courseId);

        student.addCourse(course);
        return service.save(student);
    }
}

/*
faculty-student
one - many
faculty - id, name
students - id, name, age, faculty_id
*/


/*
Relations -> connections
4 types:
1-1,                1-many,             many-1,          many-many
Student-Admission,  Faculty-Students,   Faculty-College, Students-Courses
Students-Courses
Students - roll, name, age
Courses  - id, name, weightage
student_courses - roll, id
Student
name, email, age, id, dept_id
khavin, k@g.c, 26, 1, 1
nikil, k@g.c, 26, 2, 1
Department
name, hod, id
CSE, ABC, 1
*/
