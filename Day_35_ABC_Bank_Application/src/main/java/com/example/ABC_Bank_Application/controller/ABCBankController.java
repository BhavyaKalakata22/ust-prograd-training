package com.example.ABC_Bank_Application.controller;


import com.example.ABC_Bank_Application.entities.Account;
import com.example.ABC_Bank_Application.entities.Customer;
import com.example.ABC_Bank_Application.service.AccountService;
import com.example.ABC_Bank_Application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class ABCBankController {
    static String email, password;
    static Customer activeCustomer;
    @Autowired
    private AccountService accountService;

    @Autowired
    private CustomerService customerService;

    // Method to display index.html @return index.html

    @RequestMapping("/")
    public String index() {
        return "index";
    }

     // Method to display register.html @return register.html

    @RequestMapping("/register")
    public String register() {
        return "register";
    }


   //   Method to forgotPassword.html @return

    @RequestMapping("/forgotPassword")
    public String forgotPassword() {
        return "forgotPassword";
    }


    @PostMapping("/")
    public String updatePassword(HttpServletRequest request, Model model) {
        if (!(request.getParameter("newPassword").equals(request.getParameter("confirmPassword")))) {
            model.addAttribute("message", "Re-enter the same password!!!");
            return "forgotPassword";
        } else {
            email = request.getParameter("email");
            password = request.getParameter("newPassword");
            Customer customer = customerService.getCustomerByEmail(email);
            customer.setPassword(password);
            customerService.saveCustomer(customer);
            return "index";
        }
    }


    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String loginAfterRegister(HttpServletRequest request, Model model) {
        if (!(request.getParameter("password").equals(request.getParameter("confirmPassword")))) {
            model.addAttribute("message", "Re-enter the same password!!!");
            return "register";
        } else {
            model.addAttribute("successMessage", " Your done Successfully!!!");
            email = request.getParameter("email");
            String name = request.getParameter("customerName");
            password = request.getParameter("password");
            String address = request.getParameter("customerAddress");
            String phone = request.getParameter("phoneNumber");
            Customer customer = new Customer(email, name, password, address, phone);
            customerService.saveCustomer(customer);
            Account account = new Account(name, 0.00, customer, "ABC Bank", "ABC000410", address);
            accountService.saveAccount(account);
            customer.setAccount(account);
            customerService.saveCustomer(customer);
            return "login";
        }
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }


    @PostMapping("/home")
    public String home(Model model, HttpServletRequest request) {
        Customer customer = customerService.getCustomerByEmailAndPassword(request.getParameter("email"), request.getParameter("password"));
        if (!(Objects.isNull(customer))) {
            model.addAttribute("successMessage", "heyy welcome!!!");
            email = request.getParameter("email");
            password = request.getParameter("password");
            activeCustomer = customer;
            return "home";
        } else {
            model.addAttribute("message", "Invalid user credentials!!!");
            return "login";
        }
    }

    @RequestMapping("/userDetails")
    public String userDetailsDisplay(Model model) {
        Customer customer = customerService.getCustomerByEmail(email);
        model.addAttribute("name", customer.getCustomerName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("address", customer.getCustomerAddress());
        model.addAttribute("phone", customer.getPhoneNumber());
        return "userDetails";

    }

    @RequestMapping("/updateDetails")
    public String editDetails(Model model) {
        Customer customer = customerService.getCustomerByEmail(email);
        model.addAttribute("name", customer.getCustomerName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("address", customer.getCustomerAddress());
        model.addAttribute("phone", customer.getPhoneNumber());
        return "updateDetails";
    }
    @PostMapping("/userDetails")
    public String afterUpdate(HttpServletRequest request, Model model) {
        Customer customer = customerService.getCustomerByEmail(email);
        customer.setCustomerName(request.getParameter("name"));
        customer.setCustomerAddress(request.getParameter("address"));
        customer.setPhoneNumber(request.getParameter("phone"));
        customerService.saveCustomer(customer);
        model.addAttribute("name", customer.getCustomerName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("address", customer.getCustomerAddress());
        model.addAttribute("phone", customer.getPhoneNumber());
        model.addAttribute("successMessage", "Updation Successful!!!");
        return "userDetails";
    }


    @RequestMapping("/accountDetails")
    public String accountDetailsDisplay(Model model) {
        Customer customer = customerService.getCustomerByEmail(email);
        Account account = accountService.getAccountByCustomerId(customer);
        model.addAttribute("accountId", account.getId());
        model.addAttribute("accountBalance", account.getAccountBalance());
        model.addAttribute("bankName", account.getBankName());
        model.addAttribute("ifscCode", account.getIFSCCode());
        model.addAttribute("bankBranch", account.getBranchName());
        return "accountDetails";
    }

   //Transfer starts here
    @RequestMapping("/transfer")
    public String transfer() {
        return "transfer";
    }

    @PostMapping("/transfer")
    public String afterTransfer(HttpServletRequest request, Model model) {
        Account myAccount = accountService.getAccountByCustomerId(activeCustomer);
        Double transferAmount = Double.parseDouble(request.getParameter("transferAmount"));
        if (!(transferAmount >= 0)) {
            model.addAttribute("message", "Amount not valid!!!");
            return "transfer";
        } else {
            if (!(myAccount.getAccountBalance() > transferAmount)) {
                model.addAttribute("message", "Insufficient Balance!!!");
                return "transfer";
            } else {
                Account toAccount = accountService.getAccountByAccountId(Long.parseLong(request.getParameter("toAccount")));
                if (!(Objects.isNull(toAccount))) {
                    Double myAccountBalance = (myAccount.getAccountBalance()) - transferAmount;
                    myAccount.setAccountBalance(myAccountBalance);
                    accountService.saveAccount(myAccount);
                    Double toAccountBalance = (toAccount.getAccountBalance()) + transferAmount;
                    toAccount.setAccountBalance(toAccountBalance);
                    accountService.saveAccount(toAccount);
                    model.addAttribute("successMessage", "heyyy!!!It's done transfered Successfully!!!");
                    return "transfer";
                } else {
                    model.addAttribute("message", "Account does not exist!!!");
                    return "transfer";
                }
            }

        }
    }
    //displays deposit

    @RequestMapping("/deposit")
    public String deposit() {
        return "deposit";
    }

    @PostMapping("/deposit")
    public String afterDeposit(HttpServletRequest request, Model model) {
        if (!((Double.parseDouble(request.getParameter("depositAmount"))) >= 0)) {
            model.addAttribute("message", "Amount is Invalid!!!Try again");
            return "deposit";
        } else {
            Account myAccount = accountService.getAccountByCustomerId(activeCustomer);
            Double updatedBalance = (myAccount.getAccountBalance()) + Double.parseDouble(request.getParameter("depositAmount"));
            myAccount.setAccountBalance(updatedBalance);
            accountService.saveAccount(myAccount);
            model.addAttribute("successMessage", "heyy!!!amount Deposited successfully!!!");
            return "deposit";
        }
    }
}