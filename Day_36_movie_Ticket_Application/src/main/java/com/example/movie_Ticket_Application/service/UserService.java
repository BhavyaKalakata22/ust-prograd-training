package com.example.movie_Ticket_Application.service;


import com.example.movie_Ticket_Application.entity.User;
import com.example.movie_Ticket_Application.repositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepositary customerRepository;

    public User createCustomer(User customer){
        return customerRepository.save(customer);
    }

    public Boolean existsById(String userName){
        return customerRepository.existsById(userName);
    }

    public User findCustomerByUserName(String userName){
        return customerRepository.getById(userName);
    }
}
