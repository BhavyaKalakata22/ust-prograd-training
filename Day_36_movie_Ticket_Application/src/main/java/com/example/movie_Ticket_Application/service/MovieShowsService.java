package com.example.movie_Ticket_Application.service;
import com.example.movie_Ticket_Application.entity.MovieShows;
import com.example.movie_Ticket_Application.repositary.MovieShowsRepositary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowsService {
    @Autowired
    private MovieShowsRepositary movieShowsRepository;

    public List<MovieShows> showsDetails(Long movieId){
        return movieShowsRepository.findByMovieMovieId(movieId);
    }

    public List<MovieShows> showsList(){
        return movieShowsRepository.findAll();
    }
    public MovieShows getById(Long id){
        return movieShowsRepository.getById(id);
    }
    public  Boolean existsById(Long id){
        return movieShowsRepository.existsById(id);
    }
}