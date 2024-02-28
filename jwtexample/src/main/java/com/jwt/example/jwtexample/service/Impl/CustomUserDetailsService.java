package com.jwt.example.jwtexample.service.Impl;


import com.jwt.example.jwtexample.models.User;
import com.jwt.example.jwtexample.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepositories userRepositories;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepositories.findByEmail(username).orElseThrow(()->new UsernameNotFoundException("user not registered !! "));
        return user;
    }
}
