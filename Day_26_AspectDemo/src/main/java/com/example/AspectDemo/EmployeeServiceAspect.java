package com.example.AspectDemo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
    @Pointcut()
    @Before("execution(public String getName())")
        public void getNameAdvice(){
            System.out.println("Executing Advice on getName()");
        }
        @Before("execution(public String getEmpId())")
           public void getIdAdvice(){
        System.out.println("Executing Advice on getEmpId()");
    }

         @After("execution(public String getName())")
         public void AfterAdvice(){
        System.out.println("Running After Advice on getName()");
    }

    @AfterThrowing("execution(public String getEmpId())")
    public void logExceptions(){
        System.out.println("Exception thrown in Employee Method");
    }

    @AfterReturning("execution(public String getName())")
    public void getNameReturningAdvice(){
        System.out.println("getNameReturningAdvice executed");

    }

}





