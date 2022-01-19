package com.example.movie_Ticket_Application.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookedSeats {
    @Id
    @GeneratedValue
    private Long id;
    private String seats;
    private Double seatPrice;
    @JsonIgnore
    @ManyToOne
    private User customer;
    @JsonIgnore
    @ManyToOne
    private MovieShows movieShows;


    public BookedSeats() {
    }

    public BookedSeats(String seats, Double seatPrice) {
        this.seats = seats;
        this.seatPrice = seatPrice;
    }



    public MovieShows getMovieShows() {
        return movieShows;
    }

    public void setMovieShows(MovieShows movieShows) {
        this.movieShows = movieShows;
    }

    public Double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(Double seatPrice) {
        this.seatPrice = seatPrice;
    }


    public  User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

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
}