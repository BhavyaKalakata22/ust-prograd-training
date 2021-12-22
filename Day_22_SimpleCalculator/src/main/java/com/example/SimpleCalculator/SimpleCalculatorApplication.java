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
		double add = cal.add();
		System.out.println("Addition of two Numbers : " +add);
		double sub = cal.sub();
		System.out.println("subtraction of two Numbers : " +sub);
		double mul = cal.mul();
		System.out.println("Multiplication of two Numbers : " +mul);
		double div = cal.div();
		System.out.println("Division of two Numbers : " +div);
	}


}
