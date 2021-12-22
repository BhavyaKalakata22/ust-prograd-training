package com.example.SimpleCalculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
double num1;
 double num2;
public Calculator(@Value("${cal.num1}") double num1,@Value("${cal.num2}") double num2) {

    this.num1 = num1;
    this.num2 = num2;
}
    public double getnum1() {
        return num1;
    }
    public void setnum1(double num1) {
        this.num1 = num1;
    }
    public double getnum2()
    {
        return num2;
    }
    public void setnum2(double num2) {
        this.num2 = num2;
    }
    //Method for addition
    public double add(){
        return num1+num2;

    }
    //Method for subtraction
    public double sub(){
        return num1-num2;

    }
    //Method for multiplication
    public double mul(){
        return num1*num2;

    }
    //Method for division
    public double div(){
       return num1/num2;

    }
}
