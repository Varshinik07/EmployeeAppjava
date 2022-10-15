package com.nestdigital.EmployeeApp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to homepage";
    }
    @GetMapping("/add")
    public String Addpage(){
        return "Welcome to Employee add page";
    }
    @GetMapping("/search")
    public String Searchpage(){
        return "Welcome to Employee search page";
    }
    @GetMapping("/delete")
    public String Deletepage(){
        return "Welcome to Employee delete page";
    }
}
