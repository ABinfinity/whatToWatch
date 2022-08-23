package com.example.whattowatch.controller;


import com.example.whattowatch.entity.Movie;
import com.example.whattowatch.entity.MovieList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;


@RestController
public class WhatToWatchController {

    @GetMapping("/suggest")
    public Movie getSuggestion(){
        try{

            var url = "https://imdb-api.com/en/API/Top250Movies/k_9oruxrie";

            RestTemplate restTemplate = new RestTemplate();
            MovieList movies = restTemplate.getForObject(url, MovieList.class);

            Random random = new Random();
            int rank = random.nextInt(1,250);

            var movie = movies.getItems();
            var movieN = movie.get(rank);
            System.out.println(movieN);

            return movieN;
        }
        catch(Exception e){
            System.out.println(e);
        }

        return null;
    }
}
