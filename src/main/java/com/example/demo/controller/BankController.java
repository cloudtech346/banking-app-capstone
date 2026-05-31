package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    @GetMapping("/health")
    public String health() {
        return "Banking Application Running";
    }

    @GetMapping("/balance")
    public String balance() {
        return "Current Balance: 50000";
    }
}
