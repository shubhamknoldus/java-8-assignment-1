package edu.knoldus.application;

import edu.knoldus.operation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {

        PrintPrimeUsingLambda obj = new PrintPrimeUsingLambda();
        ReadFileContents readFile = new ReadFileContents();
        SumListElements sumList = new SumListElements();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        /**
         * all the movies with rating more than 8 and genre comedy.
         */
        Predicate<Movie> filterRatingEightAndComedy = movie ->  (movie.rating > 8 && movie.genre == Genre.Comedy);
        /**
         * all the movies with release year greater than 2000 and rating less than 8.
         */
        Predicate<Movie> ratingLessEightYear = movie ->  (movie.rating < 8 && movie.year > 2000);
        /**
         * all the movies with rating as even number.
         */
        Predicate<Movie> filterRatingAsEven = movie ->  (movie.rating % 2 == 0);
        /**
         *  all the movies with rating equals to 7 and genre Sci-Fi.
         */
        Predicate<Movie> filterRating7SSciFi = movie ->  (movie.rating == 7 && movie.genre == Genre.SciFi);


        System.out.println(obj.initialList);
        System.out.println(obj.printPrimeFromList());
        System.out.println(readFile.returnWordCount());
        System.out.println(sumList.sumList(new ArrayList<>(list),new ArrayList<>(list2)));
        System.out.println(sumList.sumList(new ArrayList<>(list2),new ArrayList<>(list)));


        List<Movie> movieList = Arrays.asList(
          new Movie("DDLJ", 2000, 10, Genre.Romance),
          new Movie("Bhagam Bhag", 2010, 6, Genre.Comedy),
          new Movie("Hera Pheri", 2006, 9, Genre.Comedy),
          new Movie("Interstellar", 2004, 7, Genre.SciFi),
          new Movie("Star Trek", 2002, 5, Genre.SciFi)
        );

        System.out.println(
                movieList.stream()
                .filter(filterRatingEightAndComedy)
                .collect(Collectors.toList())
        );
        System.out.println(
                movieList.stream()
                        .filter(ratingLessEightYear)
                        .collect(Collectors.toList())
        );
        System.out.println(
                movieList.stream()
                        .filter(filterRatingAsEven)
                        .collect(Collectors.toList())
        );
        System.out.println(
                movieList.stream()
                        .filter(filterRating7SSciFi)
                        .collect(Collectors.toList())
        );
    }
}
