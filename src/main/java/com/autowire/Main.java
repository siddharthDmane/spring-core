package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire-context.xml");
        // Student s1 = context.getBean("s1",Student.class);
        // Student s2 = context.getBean("s2",Student.class);
        // Student s3 = context.getBean("s3",Student.class);
        // Student s4 = context.getBean("s4",Student.class);
        Student s5 = context.getBean("s5",Student.class);


        // System.out.println("using bean's ref");
        // System.out.println(s1);

        // System.out.println("byName");
        // System.out.println(s2);

        // System.out.println("byType");
        // System.out.println(s3);
        
        // System.out.println("constructor");
        // System.out.println(s4);

        System.out.println("autowired");
        System.out.println(s5);
    }
}
