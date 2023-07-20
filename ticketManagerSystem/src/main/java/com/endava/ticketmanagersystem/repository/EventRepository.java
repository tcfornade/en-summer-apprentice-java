package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
