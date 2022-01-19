package com.example.movie_Ticket_Application.repositary;

import com.example.movie_Ticket_Application.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepositary extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}
