package com.kodilla.testing.shape;

import org.junit.*;

import java.util.LinkedList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle("circle", 2);
        ShapeCollector collector = new ShapeCollector();
        //When
        Shape result = collector.addFigure(new Circle("circle",2));
        // Then
        Assert.assertEquals(shape, result);

    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Circle("circle", 2);
        ShapeCollector collector = new ShapeCollector();
        //When
        Shape result1 = collector.removeFigure(new Circle("circle",2));
        // Then
        Assert.assertEquals(shape, result1 );
    }


    @Test
    public void testGetFigure() {
        //Given
        LinkedList<Shape> listt = new LinkedList<Shape>();
        listt.add(new Circle("circle", 2));
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.getFigure(listt,0);

        // Then
        Assert.assertEquals(listt.get(0), collector.getFigure(listt,0));
    }
}
