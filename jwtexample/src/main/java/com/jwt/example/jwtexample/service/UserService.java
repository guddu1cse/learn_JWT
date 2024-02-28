package com.jwt.example.jwtexample.service;

import com.jwt.example.jwtexample.models.User;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserService {

    List<User> getUser();
    User createUser(User user);
}
