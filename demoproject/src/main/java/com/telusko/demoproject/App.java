package com.telusko.demoproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        // Load spring.xml from the classpath (usually src/main/resources)
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        // Get bean from container
        Alien obj = (Alien) context.getBean("myBean");
        obj.code();
    }
}
