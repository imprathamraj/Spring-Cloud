package com.flight.configuration;

import com.flight.service.FlightService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlightConfig {

    @Bean
    public FlightService flightBean(){
        return new FlightService();
    }

    @Bean
    public ModelMapper modelMapperBean(){
        return new ModelMapper();
    }
}
