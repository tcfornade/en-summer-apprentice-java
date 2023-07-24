package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Orders;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Order, Integer> {

}
