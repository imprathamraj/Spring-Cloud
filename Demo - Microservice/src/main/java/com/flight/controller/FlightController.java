package com.flight.controller;

import com.flight.response.FlightResponse;
import com.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flight/{flight_id}")
    private ResponseEntity<FlightResponse> getFlightDetails (@PathVariable("flight_id") int flight_id) {
        FlightResponse flight = flightService.getFlightById(flight_id);
        return ResponseEntity.status(HttpStatus.OK).body(flight);
    }
}
