/*
package com.example.ABC_Bank_Application.service.Impl;

import com.example.ABC_Bank_Application.entities.Transaction;

import com.example.ABC_Bank_Application.entities.User;
import com.example.ABC_Bank_Application.repositary.TransactionRepositary;
import com.example.ABC_Bank_Application.service.TransactionService;
import com.example.ABC_Bank_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepositary transactionRepository;


    public List<Transaction> findTransactionList(String username) {
        User user = userService.findByUsername(username);
        return user.getAccount().getTransactionList();
    }

    public void saveTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

}*/
