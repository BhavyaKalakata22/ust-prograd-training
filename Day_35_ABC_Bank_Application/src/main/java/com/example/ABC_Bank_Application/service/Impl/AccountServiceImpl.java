/*
package com.example.ABC_Bank_Application.service.Impl;
import com.example.ABC_Bank_Application.entities.Account;
import com.example.ABC_Bank_Application.entities.Transaction;
import com.example.ABC_Bank_Application.entities.User;
import com.example.ABC_Bank_Application.repositary.AccountRepositary;
import com.example.ABC_Bank_Application.service.AccountService;
import com.example.ABC_Bank_Application.service.TransactionService;
import com.example.ABC_Bank_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepositary accountRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionService transactionService;

    @Override
    public Account createAccount() {
        Account account = new Account();
        account.setBalance(0.0);
        account.setAccountNumber(new Random().nextInt());
        accountRepository.save(account);

        return accountRepository.findByAccountNumber(account.getAccountNumber());
    }

    @Override
    public void deposit(double amount, User user) {
        Account account = user.getAccount();
        account.setBalance(account.getBalance() + amount);
        accountRepository.save(account);
        Transaction depositTransaction = new Transaction(LocalDate.now(), "Deposit to account", amount, account);
        transactionService.saveTransaction(depositTransaction);
    }

    @Override
    public void withdraw(double amount, User user) {
        Account account = user.getAccount();
        account.setBalance(account.getBalance() - (amount));
        accountRepository.save(account);
        Transaction withDrawTransaction = new Transaction(LocalDate.now(), "Withdraw from account", amount, account);
        transactionService.saveTransaction(withDrawTransaction);
    }
}
*/
