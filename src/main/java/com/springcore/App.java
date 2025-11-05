package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // Student s1 = new Student(1, "ABCD", "Satara");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Course c1 = (Course) context.getBean("c1");
        Course c2 = (Course) context.getBean("c2");
        
        System.out.println( c2 );

    }
}
