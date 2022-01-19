
package com.example.movie_Ticket_Application.repositary;


import com.example.movie_Ticket_Application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<User, String> {
}

