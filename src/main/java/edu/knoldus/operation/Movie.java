package edu.knoldus.operation;


import java.util.List;

/**
 * class movie
 */

public class Movie {
    public String name;
    public Integer year;
    public Integer rating;
    public Enum<Genre> genre;


    public Movie(String name, Integer year, Integer rating, Enum<Genre> genre) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie name is " + this.name +
                " year " + this.year +
                " rating "+ this.rating +
                " Genre "+ this.genre + "\n";
    }
}
