package com.jwt.example.jwtexample.homeController;


import com.jwt.example.jwtexample.models.User;
import com.jwt.example.jwtexample.service.UserService;
import com.jwt.example.jwtexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService ;

    // http://localhost:3456/home/user
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting user information's !!");
        return this.userService.getUser();

    }


    @GetMapping("/current-user")
    public Principal getLogInUSer(Principal principal){
        return principal;
    }

}
