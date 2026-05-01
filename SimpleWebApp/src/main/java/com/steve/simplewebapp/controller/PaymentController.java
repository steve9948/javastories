package com.steve.simplewebapp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @RequestMapping("payment")

    public String processPayment() {
        return "Hello from payment page!";
    }
}
