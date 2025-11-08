package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("./stereotype-context.xml");
        Student s1 = (Student)context.getBean("student");
        System.out.println(s1);
    }
}
