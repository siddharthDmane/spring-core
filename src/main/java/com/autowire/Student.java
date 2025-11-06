package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    public int id;
    public String name;

    // @Autowired
    // @Qualifier("c1")
    public Course course;

    public Student() { }

    // @Autowired
    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
        System.out.println("constructor");
    }

    public void setId(int id) { this.id = id;   }
    public void setName(String name) {  this.name = name;   }

    // @Autowired
    // @Qualifier("c2")
    public void setCourse(Course course) {  this.course = course; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
    }
}
