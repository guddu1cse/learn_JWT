package com.jwt.example.jwtexample.homeController;


import com.jwt.example.jwtexample.models.User;
import com.jwt.example.jwtexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user) , HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUser(){
        return new ResponseEntity<>(userService.getUser() , HttpStatus.OK);
    }
}
