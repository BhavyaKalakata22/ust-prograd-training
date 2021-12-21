package com.example.HelloUst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String hello(){
        return "Hello UST.Practice Spring examples";
    }

}
