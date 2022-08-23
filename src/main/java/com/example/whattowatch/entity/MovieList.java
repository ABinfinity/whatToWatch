package com.example.whattowatch;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class MovieList {

    @Autowired
    private ArrayList<Movie> items;
}
