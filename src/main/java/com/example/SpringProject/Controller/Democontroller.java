package com.example.SpringProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {
    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }

}
