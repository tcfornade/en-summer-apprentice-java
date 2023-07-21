package com.endava.ticketmanagersystem.service;

import com.endava.ticketmanagersystem.model.Orders;
import com.endava.ticketmanagersystem.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrdersRepository ordersRepository;


    public Orders create(Orders order) {
        return OrdersRepository.save(order);
    }

    public List<Orders> findAllByCustomerID(Integer customerID){
        return ordersRepository.findAllByCustomer_CustomerID(customerID);
    }
}
