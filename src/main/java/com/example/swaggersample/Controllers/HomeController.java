package com.example.swaggersample.Controllers;

import com.example.swaggersample.DTO.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String viewHome(){
        return "This is a test";
    }

    @GetMapping("/get-user")
    public UserDTO getUser(){
        return UserDTO.builder().email("swaggerTest@gmail.com").country("Lagos, Nigeria").name("Swagger OpenAPI").build();
    }
}
