package com.example.BootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @RequestMapping("/About")
    public String about()
    {
        System.out.println("About page");
        return "About page";
    }
    @RequestMapping("/")
    public String index()
    {
        System.out.println("Home page");
        return "Home page";
    }

}
