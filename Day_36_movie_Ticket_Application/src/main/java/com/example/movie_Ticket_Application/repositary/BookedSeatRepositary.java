package com.example.movie_Ticket_Application.repositary;


import com.example.movie_Ticket_Application.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatRepositary extends JpaRepository<BookedSeats, Long> {
    public Boolean existsBySeats(String seats);
    public Boolean existsByMovieShowsId(Long id);
    public BookedSeats getBySeatsAndMovieShowsId(String seats, Long id);
    public List<BookedSeats> findByMovieShowsId(Long id);
    public List<BookedSeats> findByCustomerUserName(String username);
}
