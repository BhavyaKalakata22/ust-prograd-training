package com.example.BeanFactory_Names;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class BeanFactoryNamesApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeanFactoryNamesApplication.class, args);
		for (String bean : context.getBeanDefinitionNames()) {
			System.out.println(bean);
			//System.out.println(context.getBeanDefinitionCount());
		}
		System.out.println(context.getBeanDefinitionCount());

	}
}

