package com.endava.ticketmanagersystem.service;

import com.endava.ticketmanagersystem.model.OrderResponseDTO;
import com.endava.ticketmanagersystem.model.OrderResponseDTOMapper;
import com.endava.ticketmanagersystem.model.Orders;
import com.endava.ticketmanagersystem.repository.CustomerRepository;
import com.endava.ticketmanagersystem.repository.OrdersRepository;
import com.endava.ticketmanagersystem.repository.TicketCategoryRepository;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrdersRepository orderRepository;


    @Autowired
    private OrderResponseDTOMapper orderResponseDTOMapper;

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Order getOrderByID(int orderID) {return orderRepository.findById(orderID).orElse(null);}

    public List<OrderResponseDTO> getOrders(){
        List<Orders> orders = OrdersRepository.findAll();
        return orders.stream()
                .filter(order -> order.getCustomer().getCustomerID() == 1)
                .map(OrderResponseDTOMapper)
                .collect(Collectors.toList());
    }

}

