package com.example.BootDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//command Line Runner
//Application Line Runner

@SpringBootApplication
public class BootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(BootDemoApplication.class, args);
		System.out.println("Hello UST");
	}
	@Override
	public void run(String... args)
	{
		System.out.println("Command Line Arguments");
	}

}
