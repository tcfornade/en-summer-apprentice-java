package com.endava.ticketmanagersystem.service;

import com.endava.ticketmanagersystem.model.Event;
import com.endava.ticketmanagersystem.repository.EventRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private EventRepository eventRepository;

    public Event create(Event event){
        return eventRepository.save(event);
    }

    public List<Event> findAll(){
        return (List<Event>) eventRepository.findAll();
    }

    public Optional<Event> findEvent(Integer eventID) {
        return eventRepository.findById(eventID);
    }

    public List<Event> findAllByVenueIDAndEventType(String eventTypeName, Integer venueID){
        return eventRepository.findAllByEventType_NameAndVenue_VenueID(eventTypeName, venueID);
    }

    public Event findByEventID(Integer eventID){
        return  eventRepository.findByEventID(eventID);
    }

}
