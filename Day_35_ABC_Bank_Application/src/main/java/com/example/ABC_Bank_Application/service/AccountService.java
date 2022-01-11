package com.example.ABC_Bank_Application.service;

import com.example.ABC_Bank_Application.entities.Account;
import com.example.ABC_Bank_Application.entities.Customer;
import com.example.ABC_Bank_Application.repositary.AccountRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {
    @Autowired
    private AccountRepositary accountRepository;

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
    public Account getAccountByCustomerId(Customer customer) {
        return accountRepository.findAccountByCustomerId(customer);
    }
    public Account getAccountByAccountId(Long accountId) {
        return accountRepository.findAccountByAccountId(accountId);
    }
}