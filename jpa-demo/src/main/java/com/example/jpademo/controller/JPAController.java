package com.example.jpademo.controller;

import com.example.jpademo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpademo.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class JPAController {

    @Autowired
    private StudentService service;
    @RequestMapping("/")
    public String home(){
        Student student1 = new Student("bhavya","ECE",34.3f,24,"98765123");
       service.saveStudent(student1);
        System.out.println("success");
        return "Home Page";
    }

    /*
    @GetMapping --> common, less data
    @PostMapping --> sensitive, large data
    @PutMapping
    @PatchMapping

    Request mapping is always a get mapping,
    get mapping not that secured, post mapping is more security-->data will be embedded in http header
    get mapping --> non sensitive data, for sensitive data like password we go with post mapping
     */

    @RequestMapping("/create")
    public Student create(HttpServletRequest request){ //httpservletreq --> to get values from the url
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        Student student = new Student(name,"EEE",76.3f,45,"89765431");
        return service.saveStudent(student);//this part is jpa
    }

    @RequestMapping("/list")
    public List<Student> list(){
        return service.listAll();
    }

}



