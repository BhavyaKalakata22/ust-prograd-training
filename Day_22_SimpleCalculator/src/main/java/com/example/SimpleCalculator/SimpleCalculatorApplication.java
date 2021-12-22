package com.example.SimpleCalculator;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@Component
public class SimpleCalculatorApplication {
	//@Value("${spring.application.name}")
	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SimpleCalculatorApplication.class, args);
		Calculator cal = context.getBean(Calculator.class);
        System.out.println("Addition: " +cal.add());
		System.out.println("subtraction: " +cal.sub());
        System.out.println("Multiplication: " +cal.mul());
		System.out.println("Division: " +cal.div());
	}


}
