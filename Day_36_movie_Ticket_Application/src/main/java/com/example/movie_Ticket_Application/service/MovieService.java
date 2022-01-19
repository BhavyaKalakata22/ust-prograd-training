package com.example.movie_Ticket_Application.service;
import com.example.movie_Ticket_Application.entity.Movie;
import com.example.movie_Ticket_Application.repositary.MovieRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepositary movieRepository;

    public List<Movie> movieList(){
        return movieRepository.findAll();
    }
    public Movie getByMovieId(Long movieId){
        return movieRepository.getById(movieId);
    }
}
