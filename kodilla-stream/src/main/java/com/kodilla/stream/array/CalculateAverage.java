package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class CalculateAverage {

     public OptionalDouble getAverage(Integer[] numbers1) {
        List<Integer> myNumbersList = Arrays.asList(numbers1);
        IntStream myStream = IntStream.range(0, myNumbersList.size());
        myStream.forEach(s -> System.out.println(s));
        List<Integer> myNumbersList1 = Arrays.asList(numbers1);
        IntStream myStream2 = IntStream.range(0, myNumbersList1.size());
        OptionalDouble myAverage = myStream2.average();
        return myAverage;
    }
}
