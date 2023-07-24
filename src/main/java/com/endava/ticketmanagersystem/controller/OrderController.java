package com.endava.ticketmanagersystem.controller;

import com.endava.ticketmanagersystem.model.Orders;
import com.endava.ticketmanagersystem.repository.OrdersRepository;
import com.endava.ticketmanagersystem.service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    public final OrderService ordersService;

    @Autowired
    public OrderController(OrderService ordersService) {
        this.ordersService = ordersService;
    }

    }


