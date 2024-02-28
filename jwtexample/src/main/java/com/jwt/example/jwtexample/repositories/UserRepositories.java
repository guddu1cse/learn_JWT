package com.jwt.example.jwtexample.repositories;


import com.jwt.example.jwtexample.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositories extends JpaRepository<User, String> {

    Optional<User> findByEmail(String username);

}
