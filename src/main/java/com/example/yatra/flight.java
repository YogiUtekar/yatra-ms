package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/myflight")
    public String getData(){
        return"Please book your flight here,choose your favourite Airline Indigo";
    }

}
