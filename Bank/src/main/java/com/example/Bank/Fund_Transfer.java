package com.example.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fund_Transfer {

    @Autowired
    Account RemainingBalance;

    public void fundTransfer(double transferAmount, @Autowired
            Customer customerAmount, String CreditOrdebit) {
        switch (CreditOrdebit) {
            case "Credit": {
                double balance = RemainingBalance.withdrawalAmount(transferAmount);
                customerAmount.setAccountBalance(balance);
                System.out.println("Remaining after credited :  " + balance);
            }
            break;
            case "deposit":
                double balance = RemainingBalance.depositAmount(transferAmount);
                customerAmount.setAccountBalance(balance);
                System.out.println("Remaining after debited :  " + balance);
                break;
        }
    }
}
