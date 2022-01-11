/*
package com.example.ABC_Bank_Application.entities;

@Component
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "accountid")
    private Long accountId;
    @Column(name = "accountholdername", nullable = false)
    private String accountHolderName;
    private Double accountBalance;
    @OneToOne
    private Customer customer;
    @Column(name = "bankname")
    private String bankName;
    private String IFSCCode;
    @Column(name = "branchname")
    private String branchName;

    public Account() {

    }

    public Account(String accountHolderName, Double accountBalance, Customer customer, String bankName, String IFSCCode, String branchName) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.customer=customer;
        this.bankName = bankName;
        this.IFSCCode = IFSCCode;
        this.branchName = branchName;
    }

    public Long getId() {
        return accountId;
    }

    public void setId(Long id) {
        this.accountId = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}



*//*

*/
/*
@Component
@Entity
@Table
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "date")
    private LocalDate transactionDate;

    @Column(name = "comment")
    private String comment;

    @Column(name = "amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name = "accountNumber")
    private Account account;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionDate=" + transactionDate +
                ", comment='" + comment + '\'' +
                ", amount=" + amount +
                ", account=" + account +
                '}';
    }

    public Transaction() {
    }

    public Transaction(LocalDate transactionDate, String comment, double amount, Account account) {
        this.transactionDate = transactionDate;
        this.comment = comment;
        this.amount = amount;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

*/
