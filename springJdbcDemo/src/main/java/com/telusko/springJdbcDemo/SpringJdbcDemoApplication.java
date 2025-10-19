package com.telusko.springJdbcDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springJdbcDemo.model.Alien;
import com.telusko.springJdbcDemo.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcDemoApplication.class, args);
		System.out.println("project running");
		
		Alien alien1=context.getBean(Alien.class);
		alien1.setId(20);
		alien1.setName("rahul");
		alien1.setTech("java full stack");
		Alien alien2=context.getBean(Alien.class);
		alien2.setId(22);
		alien2.setName("rahul etyala");
		alien2.setTech("mern stack");
		
		
		AlienRepo repo=context.getBean(AlienRepo.class);
		repo.save(alien1);
		System.out.println(repo.findAll());
	}
	

}
