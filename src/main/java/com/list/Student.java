package com.list;

import java.util.ArrayList;

public class Student {
    public int id;
    public String name;
    public ArrayList<Course> course;

    public Student() { }

    public Student(int id, String name, ArrayList<Course> course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void setId(int id) { this.id = id;   }
    public void setName(String name) {  this.name = name;   }
    public void setCourse(ArrayList<Course> course) {  this.course = course; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
    }
}
