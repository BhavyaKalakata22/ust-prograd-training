package com.example.jpademo.repositary;

import com.example.jpademo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


/*
repository --> top layer in db
Student repository extends => JPA repo => pagination and starting => crud


                        Repository
Controller ---------------------------------------------  Database
Interface or mediator between controller and db

It is not advised to have repository directly to controller so create service

                    Service         Repository
Controller ---------------------------------------------  Database
Interface or mediator between controller and db


service can be used like getter and setter
*/

public interface StudentRepositary extends JpaRepository<Student, Long> {
//    <Student, long> --> Entity --> Student , primary id type --> long

}




