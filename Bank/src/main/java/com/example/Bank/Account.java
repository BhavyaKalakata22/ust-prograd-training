package com.example.Bank;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Account {
    int accountNumber;
    double balance;

    Account() {

    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double withdrawalAmount(double withdrawalAmount){
        if (balance >= withdrawalAmount){
            balance = balance-withdrawalAmount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }
    public double depositAmount(double depositAmount){
        balance= balance+depositAmount;
        return balance;
    }
}