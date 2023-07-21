package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
  List<Event> findAllByEventType_NameAndVenue_VenueID(String eventTypeName, Integer venue_venueID);
  Event findByEventID(Integer eventID);
}
