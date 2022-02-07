package com.izzy.flightcheckin;

import com.izzy.flightcheckin.integration.dto.Reservation;
import com.izzy.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationRestClient {

    @Autowired
    RestTemplate restTemplate;

    private final String uri = "http://localhost:8080/flightreservation/reservation/";

    public Reservation findReservation(Long id){
        return restTemplate.getForObject(uri + id, Reservation.class);
    }

    public Reservation updateReservation(ReservationUpdateRequest updateRequest){
        return restTemplate.postForObject(uri, updateRequest, Reservation.class);
    }

}
