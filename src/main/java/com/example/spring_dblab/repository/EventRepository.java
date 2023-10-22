package com.example.spring_dblab.repository;

import com.example.spring_dblab.entitiy.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findAll();
    List<Event> findByName(String name);
    List<Event> findByCreatedAtBetween(LocalDate startDate, LocalDate endDate);
}
