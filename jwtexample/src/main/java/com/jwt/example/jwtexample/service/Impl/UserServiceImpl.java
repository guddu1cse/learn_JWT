package com.jwt.example.jwtexample.service.Impl;


import com.jwt.example.jwtexample.models.User;
import com.jwt.example.jwtexample.repositories.UserRepositories;
import com.jwt.example.jwtexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositories userRepositories;

    @Autowired
    private PasswordEncoder passwordEncoder;




    @Override
    public List<User> getUser() {
        return userRepositories.findAll();
    }

    @Override
    public User createUser(User user) {
        user.setUser_ID(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
       return userRepositories.save(user);
    }


}
