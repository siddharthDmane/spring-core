package com.springcore;

public class Course {
    public int id,credit;
    public String name;

    public Course(){}

    public Course(int id, String name, int credit){
        this.id = id;
        this.name = name; 
        this.credit = credit;
    }

    public void setId(int id){ this.id = id; }

    public void setName(String name){ this.name = name; }

    public void setCredit(int credit){ this.credit = credit; }

    public String toString(){
        return "Course[ Id : "+this.id+", Name : "+this.name+", Credit : "+this.credit+"]";
    }
}
