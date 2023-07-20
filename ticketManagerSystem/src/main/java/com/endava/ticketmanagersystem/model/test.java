package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "test")
public class test implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tsID;
    @Column(name="CustomerName")
    private String CustomerName;
    @Column(name="Email")
    private String Email;


}

