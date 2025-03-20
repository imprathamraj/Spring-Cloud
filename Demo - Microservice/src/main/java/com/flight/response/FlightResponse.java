package com.flight.response;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class FlightResponse {

    private int flight_id;
    private String flight_number;
    private String airline;
    private String departure;
    private String destination;
    private LocalDateTime departure_time;
    private LocalDateTime arrival_time;
    private double price;

}
