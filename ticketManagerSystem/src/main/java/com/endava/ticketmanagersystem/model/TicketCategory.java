package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    //getteri+setteri

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    //constructor

    public TicketCategory() {
    }

    public TicketCategory(int ticketCategoryID, String description, BigDecimal price) {
        this.ticketCategoryID = ticketCategoryID;
        this.description = description;
        this.price = price;
    }
}
