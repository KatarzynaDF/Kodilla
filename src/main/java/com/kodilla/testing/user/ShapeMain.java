package com.kodilla.testing.user;

import com.kodilla.testing.shape.*;

import java.util.LinkedList;

public class ShapeMain {

    public static void main(String[] args){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigures(new Circle("myCircle1", 2));
        shapeCollector.addFigures(new Circle("myCircle2", 3));
        shapeCollector.addFigures(new Triangle("myTriangle1", 2));
        shapeCollector.addFigures(new Triangle("myTriangle2", 3));
        shapeCollector.addFigures(new Square("mySquare", 2));
        shapeCollector.addFigures(new Square("mySquare2", 3));
        System.out.println("Twoja kolekcja po dodaniu elementów:");
        shapeCollector.showFigures();
        System.out.println("Twoja kolekcja po usunieciu elementów:");
        shapeCollector.removeFigures(new Circle("myCircle2", 3));
        shapeCollector.removeFigures(new Triangle("myTriangle2", 3));
        shapeCollector.removeFigures(new Square("mySquare2", 3));
        shapeCollector.showFigures();
        LinkedList<Shape> list = new LinkedList<>();
        list.add(new Circle("myCircle1", 2));
        list.add(new Circle("myCircle2", 3));
        list.add(new Triangle("myTriangle1", 2));
        list.add(new Triangle("myTriangle2", 3));
        list.add(new Square("mySquare", 2));
        list.add(new Square("mySquare2", 3));
        System.out.println("Wyswietlenie pierwszego elementu:"+shapeCollector.getFigures(list, 2));

    }

}
