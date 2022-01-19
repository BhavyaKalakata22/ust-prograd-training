package com.example.movie_Ticket_Application.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class MovieShows {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private Time time;
    @JsonIgnore
    @ManyToOne
    private Movie movie;
    @OneToMany(mappedBy = "movieShows")
    private List<BookedSeats> bookedSeats;
//    @OneToMany(mappedBy = "movieShows")
//    private List<Seats> seats;

    public MovieShows() {
    }

    public MovieShows(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

//    public List<Seats> getSeats() {
//        return seats;
//    }
//
//    public void setSeats(List<Seats> seats) {
//        this.seats = seats;
//    }

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}