package com.company;
import java.util.Scanner;
class InvalidUsername extends Exception{
    public InvalidUsername(String message){
        super(message);
    }
}
class InvalidPassword extends Exception{
    public InvalidPassword(String message){
        super(message);
    }
}
public class Validator {
    public static void main(String[] args) throws InvalidUsername, InvalidPassword {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.nextLine();
        if(!(username.length()>6 && username.length()<15)){
            throw new InvalidUsername("Username should be from 6 - 15 character");
        }

        char first = username.charAt(0);
        if(!(Character.isUpperCase(first))){
            throw new InvalidUsername("Username should start with uppercase alphabet letter from A - Z");
        }

        if(password.contains(username)){
            throw new InvalidUsername("Username and password cannot be same.");
        }

        if(!(password.length()>8 && password.length()<256)){
            throw new InvalidPassword ("Password should be from 8-256 character");
        }

        if((password.contains("(") || password.contains(")") || password.contains(" "))){
            throw new InvalidPassword("Password should not be contain any parenthesis or Whitespace");
        }

        System.out.println("Username " + username + " is valid.");
        System.out.println("Password " + password + " is valid.");
    }
}