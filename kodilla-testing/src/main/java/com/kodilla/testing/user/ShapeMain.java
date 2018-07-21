package com.kodilla.testing.user;

import com.kodilla.testing.shape.*;

import java.util.LinkedList;

public class ShapeMain {

    public static void main(String[] args){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle("myCircle1", 2));
        shapeCollector.addFigure(new Circle("myCircle2", 3));
        shapeCollector.addFigure(new Triangle("myTriangle1", 2));
        shapeCollector.addFigure(new Triangle("myTriangle2", 3));
        shapeCollector.addFigure(new Square("mySquare", 2));
        shapeCollector.addFigure(new Square("mySquare2", 3));
        System.out.println("Twoja kolekcja po dodaniu elementów:");
        shapeCollector.showFigure();
        System.out.println("Twoja kolekcja po usunieciu elementów:");
        shapeCollector.removeFigure(new Circle("myCircle2", 3));
        shapeCollector.removeFigure(new Triangle("myTriangle2", 3));
        shapeCollector.removeFigure(new Square("mySquare2", 3));
        shapeCollector.showFigure();
        LinkedList<Shape> listt = new LinkedList<>();
        listt.add(new Circle("myCircle1", 2));
        listt.add(new Circle("myCircle2", 3));
        listt.add(new Triangle("myTriangle1", 2));
        listt.add(new Triangle("myTriangle2", 3));
        listt.add(new Square("mySquare", 2));
        listt.add(new Square("mySquare2", 3));
        System.out.println("Wyswietlenie pierwszego elementu:"+shapeCollector.getFigure(listt, 2));

    }

}
