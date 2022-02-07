package com.izzy.flightcheckin.integration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

}
