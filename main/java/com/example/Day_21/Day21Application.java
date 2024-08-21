package com.example.Day_21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Day21Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Day21Application.class, args);

		Car_wxml obj = context.getBean(Car_wxml.class);
		obj.build();




	}

}
