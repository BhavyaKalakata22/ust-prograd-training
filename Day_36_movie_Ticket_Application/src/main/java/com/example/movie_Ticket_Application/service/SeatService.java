package com.example.movie_Ticket_Application.service;
import com.example.movie_Ticket_Application.entity.Seats;
import com.example.movie_Ticket_Application.repositary.SeatsRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatsRepositary seatsRepository;

    public Seats getBySeats(String seats){
        return seatsRepository.getBySeats(seats);
    }
}
