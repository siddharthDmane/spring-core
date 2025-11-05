package com.springcore;

public class Student {
    public int Id;
    public String Name, Address;
    
    public Student(){}
    
    public Student(int Id, String Name, String Address){
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
    }

    public void setId(int id){
        this.Id = id;
    }

    public void setName(String name){
        this.Name = name;
    }

    public void setAddress(String address){
        this.Address = address;
    }

    public int getId(){
        return this.Id;
    }

    public String getName(){
        return this.Name;
    }

    public String getAddress(){
        return this.Address;
    }

    public String toString(){
        return "Student [ StudentId : "+Id+", StudentName : "+ Name+", Address : "+Address+"]";
    }
}
