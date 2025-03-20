package com.flight.service;

import com.flight.entity.Flight;
import com.flight.repository.FlightRepo;
import com.flight.response.FlightResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class FlightService {
    @Autowired
    private FlightRepo flightRepo;

    @Autowired
    private ModelMapper mapper;

    public FlightResponse getFlightById(int flight_id){
        Optional<Flight> flight = flightRepo.findById(flight_id);
        FlightResponse flightResponse = mapper.map(flight,FlightResponse.class);
        return flightResponse;
    }
}
