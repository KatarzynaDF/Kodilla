package com.kodilla.stream;

import com.kodilla.stream.lambda.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Let`s make our poem beautiful!!!");
        poemBeautifier.makeUpperCase("na tapczanie siedzi leń", (String stringTobeaoutify) -> System.out.println(stringTobeaoutify));
        System.out.println("Let`s make our poem beautiful!!!");
        poemBeautifier.addXOXO("Samochwała w kącie stała", (String stringTobeaoutify) -> System.out.println(stringTobeaoutify));
        System.out.println("Let`s make our poem beautiful!!!");
        poemBeautifier.substringTheHalf("KOZIOLEKMATOLEK", (String stringTobeaoutify) -> System.out.println(stringTobeaoutify));
        System.out.println("Let`s make our poem beautiful!!!");
        poemBeautifier.makeLowerCase("ALA MA KOTA", (String stringTobeaoutify) -> System.out.println(stringTobeaoutify));
    }
}