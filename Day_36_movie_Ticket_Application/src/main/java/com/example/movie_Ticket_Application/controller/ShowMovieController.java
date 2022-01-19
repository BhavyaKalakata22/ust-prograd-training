package com.example.movie_Ticket_Application.controller;
import com.example.movie_Ticket_Application.entity.Movie;
import com.example.movie_Ticket_Application.service.MovieService;
import com.example.movie_Ticket_Application.service.MovieShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ShowMovieController {
    @Autowired
    private MovieShowsService movieShowsService;
    @Autowired
    private MovieService movieService;

    //MovieShows

    @GetMapping("/{userName}/movie/{movieId}")
    public String movieShows(@PathVariable String userName, @PathVariable Long movieId, Model model){
        model.addAttribute("shows", movieShowsService.showsDetails(movieId));
        model.addAttribute("userName", userName);
        Movie movie = movieService.getByMovieId(movieId);
        model.addAttribute("movieName", movie.getMovieName());
        return "movieShows";
    }


}

