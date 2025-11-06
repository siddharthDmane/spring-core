package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    public int id;
    public String name;
    
    @Autowired
    @Qualifier("course")
    public Course course;

    public Student() { }

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void setId(int id) { this.id = id;   }
    public void setName(String name) {  this.name = name;   }
    public void setCourse(Course course) {  this.course = course; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
    }
}
