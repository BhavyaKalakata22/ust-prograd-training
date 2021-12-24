package com.example.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Customer {
    String customerName;
    String customerBranch;
    int mobileNumber;
    @Autowired
    Account account;
    Customer() {
    }

   public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerBranch(String customerBranch) {
        this.customerBranch = customerBranch;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.account.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return account.accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.account.balance = accountBalance;
    }
    public double getAccountBalance(){
        return account.balance;
    }


    public void showCustomerDetails() {
        System.out.println("Name: " + customerName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Acc Number: " + account.getAccountNumber());
        System.out.println("Remaining balance: " + account.getBalance());
    }


    public Object getCustomerName() {
        return this.customerName=customerName;
    }

    public Object getCustomerBranch() {
       return this.customerBranch=customerBranch;
    }

    public Object getMobileNumber() {
      return   this.mobileNumber=mobileNumber;
    }
}