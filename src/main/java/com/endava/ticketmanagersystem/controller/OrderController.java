package com.endava.ticketmanagersystem.controller;

import com.endava.ticketmanagersystem.repository.OrderRepository;

public class OrderController {
    public final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
