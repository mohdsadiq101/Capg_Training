package com.example.orders.exception;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException() {
        super("Order not found");
    }

    public OrderNotFoundException(Long id) {
        super("Order not found with id: " + id);
    }
}
