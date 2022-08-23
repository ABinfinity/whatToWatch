package com.example.whattowatch.controller;


import com.example.whattowatch.entity.MovieList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WhatToWatchController {

    @GetMapping("/suggest")
    public MovieList getSuggestion(){
        try{

            var url = "https://imdb-api.com/en/API/Top250Movies/k_9oruxrie";

            RestTemplate restTemplate = new RestTemplate();
            MovieList movies = new MovieList();
            movies = restTemplate.getForObject(url, MovieList.class);


            return movies;
        }
        catch(Exception e){
            System.out.println(e);
        }

        return null;
    }
}
