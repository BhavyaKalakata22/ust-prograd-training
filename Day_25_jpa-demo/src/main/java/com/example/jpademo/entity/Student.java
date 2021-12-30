
package com.example.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //use javax.persistence coz hibernate is like changeable

public class Student {
    Student(){

    }
    @Id //to tell that id is the primary key
    @GeneratedValue
    private Long id;
    @Column (nullable = false)//for name should be not null in below column "name"
    private String name;
    private String batch;
    private Float marks;
    @Column (nullable = false)
    private Integer age;//not null
    @Column (nullable = false, unique = true, updatable = false)
    private String phoneNumber;



    public Student(String name, String batch, Float marks, Integer age, String phoneNumber) {
        this.name = name;
        this.batch = batch;
        this.marks = marks;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}