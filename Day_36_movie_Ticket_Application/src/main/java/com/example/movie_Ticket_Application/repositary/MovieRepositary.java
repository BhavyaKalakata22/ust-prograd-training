
package com.example.movie_Ticket_Application.repositary;


import com.example.movie_Ticket_Application.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepositary extends JpaRepository<Movie, Long> {

}



