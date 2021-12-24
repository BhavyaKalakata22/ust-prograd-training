package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller

public class Controller_Customer {
    @Autowired
    Customer customer;
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
    @RequestMapping("/Details")
    public String Details(Model model, HttpServletRequest request){
    String Username = request.getParameter("Username");
    String password = request.getParameter("Password");
    if(Username==("ABC")&&password==("ABC$123")) {
        customer.setCustomerName("Bhavya");
        customer.setCustomerBranch("TKRoad");
        customer.setMobileNumber(986651);
        customer.setAccountNumber(2100);
        customer.setAccountBalance(2500);
        model.addAttribute("name", customer.getCustomerName());
        model.addAttribute("branch", customer.getCustomerBranch());
        model.addAttribute("Mobile Number: ", customer.getMobileNumber());
        model.addAttribute("Acc No : ", customer.getAccountNumber());
        model.addAttribute("Acc Balance : ", customer.getAccountBalance());


    }
    return "Details";

    }


}
