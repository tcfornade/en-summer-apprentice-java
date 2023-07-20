package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int EventTypeID;

    @Column(name = "EventTypeName")
    public String EventTypeName;

    @OneToMany
    @JoinColumn(name = "EventType")
    private Event event;

    //getteri+setteri

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        EventTypeName = eventTypeName;
    }

    //constructor

    public EventType() {
    }

    public EventType(int eventTypeID, String eventTypeName) {
        EventTypeID = eventTypeID;
        EventTypeName = eventTypeName;
    }
}
