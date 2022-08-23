package com.example.whattowatch.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class MovieList {

    @Autowired
    private ArrayList<Movie> items;
}
