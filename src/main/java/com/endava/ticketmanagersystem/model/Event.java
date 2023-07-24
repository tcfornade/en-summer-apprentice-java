package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EventID;

 @ManyToOne
    @JoinColumn(name = "VenueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "EventTypeID")
    private EventType eventType;


    @Column(name = "EventDescription")
    private String EventDescription;

    @Column(name = "EventName")
    private String EventName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "StartDate")
    private Date StartDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EndDate")
    private Date EndDate;

    //getteri+setteri

    public int getEventID() {
        return EventID;
    }

    public void setEventID(int eventID) {
        EventID = eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }



    //constructor


    public Event() {
    }

    public Event(int eventID, Venue venue, EventType eventType, List<TicketCategory> ticketCategoryList, String eventDescription, String eventName, Date startDate, Date endDate) {
        EventID = eventID;
        this.venue = venue;
        this.eventType = eventType;
        EventDescription = eventDescription;
        EventName = eventName;
        StartDate = startDate;
        EndDate = endDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + EventID +
                ", eventType=" + eventType +
                ", name='" + EventName + '\'' +
                ", description='" + EventDescription + '\'' +
                ", startDate=" + StartDate +
                ", endDate=" + EndDate +
                //      ", ticketCategories=" + ticketCategories +
                '}';
    }
}
