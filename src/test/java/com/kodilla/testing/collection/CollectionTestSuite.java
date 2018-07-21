package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(4, 6, 3);
        //When
        oddNumbersExterminator.exterminate();
        int number1 = oddNumbersExterminator.getNumber1();
        int number2 = oddNumbersExterminator.getNumber2();
        int number3 = oddNumbersExterminator.getNumber3();

        //Then
        Assert.assertEquals(4, number1);
        System.out.println("Twoja lista nie jest pusta!");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator1 = new OddNumbersExterminator(4, 6, 3);
        ArrayList<Integer> result =oddNumbersExterminator1.exterminateEven();
        ArrayList<Integer> even = new ArrayList<>();
        even.add(4);
        even.add(6);

        //When
        int number1 = oddNumbersExterminator1.getNumber1();
        int number2 = oddNumbersExterminator1.getNumber2();
        int number3 = oddNumbersExterminator1.getNumber3();

        //Then
        Assert.assertEquals(even, result);
        System.out.println("Twoja lista zawiera tylko liczby parzyste!!");
    }
}