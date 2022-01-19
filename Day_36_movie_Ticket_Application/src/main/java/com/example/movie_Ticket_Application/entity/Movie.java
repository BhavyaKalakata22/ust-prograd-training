package com.example.movie_Ticket_Application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long movieId;
    private String movieName;
    private Date releaseDate;
    @OneToMany(mappedBy= "movie")
    private List<MovieShows> movieShows;

    public Movie() {
    }

    public Movie(String movieName, Date releaseDate) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<MovieShows> getShow() {
        return movieShows;
    }

    public void setShow(List<MovieShows> movieShows) {
        this.movieShows = movieShows;
    }
}