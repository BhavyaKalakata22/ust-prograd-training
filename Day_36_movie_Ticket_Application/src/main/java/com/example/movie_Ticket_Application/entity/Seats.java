package com.example.movie_Ticket_Application.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Seats {
    @Id
    @GeneratedValue
    private Long id;
    private String seats;
    private Double price;
//    @JsonIgnore
//    @ManyToOne
//    private MovieShows movieShows;

    public Seats() {
    }

    public Seats(String seats, Double price) {
        this.seats = seats;
        this.price = price;
    }

//    public MovieShows getMovieShows() {
//        return movieShows;
//    }
//
//    public void setMovieShows(MovieShows movieShows) {
//        this.movieShows = movieShows;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}