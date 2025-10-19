package com.rahul.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) factory.getBean("alien");
        obj.code();
        System.out.println("Age: " + obj.getAge());
    }
}
