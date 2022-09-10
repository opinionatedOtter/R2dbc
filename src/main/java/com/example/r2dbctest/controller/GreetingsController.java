package com.example.r2dbctest.controller;

import com.example.r2dbctest.model.Event;
import com.example.r2dbctest.repository.R2dbcTestRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {

    R2dbcTestRepo repo;

    public GreetingsController(R2dbcTestRepo repo){
        this.repo = repo;
    }

    @GetMapping("/")
    public String hello() {
        System.out.println("test");
        System.out.println(repo.save(new Event(
                "1",
                "cool",
                "name"
        )).block().toString());
        return "test";
    }
}
