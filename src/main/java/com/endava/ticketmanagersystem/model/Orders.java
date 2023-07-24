package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="Orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;

    @ManyToOne
    @JoinColumn(name="customerID")
            private Customer customer;

    @ManyToOne
    @JoinColumn(name="ticketCategoryID")
    private TicketCategory ticketCategory;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "OrderedAt")
    private Date OrderedAt;

    @Column(name = "NumberOfTickets")
    private int NumberOfTickets;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;


    //getteri + setteri

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getOrderedAt() {
        return OrderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        OrderedAt = orderedAt;
    }
    public int getNumberOfTickets() {
        return NumberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        NumberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }


    public Orders() {
    }

    public Orders(int orderID, Customer customer, Date orderedAt, int numberOfTickets, BigDecimal totalPrice) {
        this.orderID = orderID;
        this.customer = customer;
        OrderedAt = orderedAt;
        NumberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
}
