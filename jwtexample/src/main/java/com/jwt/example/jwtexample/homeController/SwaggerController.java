package com.jwt.example.jwtexample.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {

   @RequestMapping("/apis")
    public String apis(){
       return "redirect:swagger-ui/index.html";
   }
}
