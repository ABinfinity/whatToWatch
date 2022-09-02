package com.example.whattowatch.controller;


import com.example.whattowatch.entity.Movie;
import com.example.whattowatch.entity.MovieList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;


@RestController
public class WhatToWatchController {
	
	@Value( "${api.url}" )
	String url;

    @GetMapping("/suggest")
    public Movie getSuggestion(){
        try{
            MovieList movies = new RestTemplate().getForObject(url, MovieList.class);

            int rank = new Random().nextInt(1,250);

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
