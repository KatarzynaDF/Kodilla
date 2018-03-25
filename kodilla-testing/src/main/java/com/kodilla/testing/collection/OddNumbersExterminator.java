package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> getEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        return evenNumbers;
    }
}