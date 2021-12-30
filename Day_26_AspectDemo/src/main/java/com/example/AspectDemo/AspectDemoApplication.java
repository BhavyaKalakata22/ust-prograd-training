package com.example.AspectDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(AspectDemoApplication.class, args);
		Employee employee=context.getBean(Employee.class);
		employee.setEmpId("12K");
		employee.setName("Bhavya");
        employee.getEmpId();
		employee.getName();
	}

}
