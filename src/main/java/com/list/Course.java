package com.list;

public class Course {
    public int id;
    public String name;

    public Course() { }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setId(int id) { this.id = id;   }
    public void setName(String name) {  this.name = name; }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + "]";
    }    
}
