package com.yohanhettiarchchi98.Movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")

public class MovieController {
    @GetMapping
    public String allmovies(){
        return "All Movies";
    }
}
