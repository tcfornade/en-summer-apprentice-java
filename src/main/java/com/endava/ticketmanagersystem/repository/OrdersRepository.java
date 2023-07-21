package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Orders;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Order, Integer> {

    static Orders save(Orders order) {
        Orders o = null;
        return o;
    }

    List<Order> findAllByOrderID(Integer orderID);
    void deleteByOrderID(int orderID);

    List<Orders> findAllByCustomer_CustomerID(Integer customerID);


}
