package com.example.ABC_Bank_Application.repositary;

import com.example.ABC_Bank_Application.entities.Account;
import com.example.ABC_Bank_Application.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepositary extends JpaRepository<Account, Long> {


    @Query("Select account from Account account where account.customer=:customer")
    Account findAccountByCustomerId(@Param("customer") Customer customer);
    @Query("Select account from Account account where account.accountId=:accountId")
    Account findAccountByAccountId(@Param("accountId") Long accountId);
}
