package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        CalculateAverage calculate = new CalculateAverage();
        //When
        Integer[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        OptionalDouble result = calculate.getAverage(myNumbers);
        OptionalDouble optionalDouble = OptionalDouble.of(9.5);
        // Then
        Assert.assertEquals(optionalDouble, result);
        System.out.println(result);
        System.out.println(optionalDouble);
}
