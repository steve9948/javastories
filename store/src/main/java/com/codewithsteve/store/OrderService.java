package com.codewithsteve.store;

import org.springframework.core.annotation.Order;

public class OrderService {
    public void placeOrder() {
        var orderService = new StripePaymentService();


    }
}
