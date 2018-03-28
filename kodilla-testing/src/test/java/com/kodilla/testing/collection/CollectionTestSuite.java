package com.kodilla.testing.collection;
import org.junit.*;


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

        //Then
        System.out.println("Twoja lista nie jest pusta!");
    }

    @Test
    public void testCaseRealName() {
        //Given
        OddNumbersExterminator oddNumbersExterminator1 = new OddNumbersExterminator(4, 6, 9);
        //When
        oddNumbersExterminator1.exterminate();
        int number1 = oddNumbersExterminator1.getNumber1();
        int number2 = oddNumbersExterminator1.getNumber2();
        int number3 = oddNumbersExterminator1.getNumber3();

        //Then
        System.out.println("Twoja lista zawiera tylko liczby parzyste");
    }
}