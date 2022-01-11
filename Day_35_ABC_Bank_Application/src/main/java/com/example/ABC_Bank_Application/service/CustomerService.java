package com.example.ABC_Bank_Application.service;

import com.example.ABC_Bank_Application.entities.Customer;
import com.example.ABC_Bank_Application.repositary.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepositary customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerByEmailAndPassword(String email, String password) {
        return customerRepository.findCustomerByEmailAndPassword(email, password);
    }
    public Customer getCustomerByEmail(String email) {
        return customerRepository.findCustomerByEmail(email);
    }
}
