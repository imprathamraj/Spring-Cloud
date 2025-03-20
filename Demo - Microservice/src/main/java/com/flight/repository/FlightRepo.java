package com.flight.repository;

import com.flight.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight, Integer> {
}
