package com.example.ABC_Bank_Application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerid")
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name = "customername")
    private String customerName;
    @Column(name = "customeraddress")
    private String customerAddress;
    @Column(name = "phonenumber", unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private String password;
    @JsonIgnore
    @OneToOne
    private Account account;

    public Customer() {

    }

    public Customer(String email, String customerName, String password, String customerAddress, String phoneNumber) {
        this.email = email;
        this.customerName = customerName;
        this.password = password;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
    }
    public Customer(String email, String customerName, String password, String customerAddress, String phoneNumber, Account account) {
        this.email = email;
        this.customerName = customerName;
        this.password = password;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.account=account;
    }

    public Customer(String email, String password){
        this.email=email;
        this.password=password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}