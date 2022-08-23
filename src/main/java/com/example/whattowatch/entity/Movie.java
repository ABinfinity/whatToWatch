package com.example.whattowatch.entity;

import org.springframework.stereotype.Component;

@Component
public class Movie {

    private String id;
    private int rank;
    private String title;
    private String fullTitle;
    private int year;

    public Movie() {
    }

    public Movie(String id, int rank, String title, String fullTitle, int year, String image, String crew, int imDbRating, int imDbRatingCount) {
        this.id = id;
        this.rank = rank;
        this.title = title;
        this.fullTitle = fullTitle;
        this.year = year;
        this.image = image;
        this.crew = crew;
        this.imDbRating = imDbRating;
        this.imDbRatingCount = imDbRatingCount;
    }

    private String image;
    private String crew;
    private float imDbRating;
    private float imDbRatingCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public float getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(float imDbRating) {
        this.imDbRating = imDbRating;
    }

    public float getImDbRatingCount() {
        return imDbRatingCount;
    }

    public void setImDbRatingCount(float imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", rank=" + rank +
                ", title='" + title + '\'' +
                ", fullTitle='" + fullTitle + '\'' +
                ", year=" + year +
                ", image='" + image + '\'' +
                ", crew='" + crew + '\'' +
                ", imDbRating=" + imDbRating +
                ", imDbRatingCount=" + imDbRatingCount +
                '}';
    }
}
