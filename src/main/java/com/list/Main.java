package com.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("list-context.xml");
        
        Student s1 = context.getBean("s1",Student.class);
        System.out.println(s1);
    }
}
