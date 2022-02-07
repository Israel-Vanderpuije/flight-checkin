package com.izzy.flightcheckin.integration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    private Long id;
    private Boolean checkedIn;
    private int numberOfBags;
    private Passenger passenger;
    private Flight flight;
}
