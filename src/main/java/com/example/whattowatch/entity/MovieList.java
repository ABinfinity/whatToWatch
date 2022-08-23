package com.example.whattowatch.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class MovieList {

    @Autowired
    private ArrayList<Movie> items;

    public MovieList() {
    }

    public MovieList(ArrayList<Movie> items) {
        this.items = items;
    }

    public ArrayList<Movie> getItems() {
        return items;
    }

    public void setItems(ArrayList<Movie> items) {
        this.items = items;
    }
}
