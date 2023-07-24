package com.endava.ticketmanagersystem.repository;

import com.endava.ticketmanagersystem.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
}
