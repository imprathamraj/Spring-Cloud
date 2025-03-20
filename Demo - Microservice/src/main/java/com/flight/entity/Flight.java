package com.flight.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flight_id;

    @Column(name = "flight_number", nullable = false)
    private String flight_number;

    @Column(name = "airline", nullable = false)
    private String airline;

    @Column(name = "departure", nullable = false)
    private String departure;

    @Column(name = "destination", nullable = false)
    private String destination;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departure_time;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrival_time;

    @Column(name = "price", nullable = false)
    private double price;

}