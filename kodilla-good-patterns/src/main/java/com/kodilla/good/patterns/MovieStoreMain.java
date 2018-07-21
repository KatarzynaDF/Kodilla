package com.kodilla.good.patterns;
import java.util.stream.Collectors;

public class MovieStoreMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String titleResult  = movieStore.getMovies().entrySet().stream()
                .flatMap(title->title.getValue().stream())
        .collect(Collectors.joining("!","","!"));
        System.out.println(titleResult);
    }
}