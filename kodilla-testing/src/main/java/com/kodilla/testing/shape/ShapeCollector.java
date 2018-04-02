package com.kodilla.testing.shape;

import java.util.LinkedList;

public class ShapeCollector {

    LinkedList<Shape> list = new LinkedList<>();

    public Shape addFigure (Shape shape) {

        list.add(new Circle(shape.getName(),shape.getField()));
        list.add(new Triangle(shape.getName(),shape.getField()));
        list.add(new Square(shape.getName(),shape.getField()));
        return shape;
    }

    public Shape removeFigure(Shape shape) {

        list.remove(new Circle(shape.getName(),shape.getField()));
        list.remove(new Triangle(shape.getName(),shape.getField()));
        list.remove(new Square(shape.getName(),shape.getField()));

        return shape;
    }

    public Shape getFigure(LinkedList<Shape> listt, int i) {

        return listt.get(i);
    }
    public void showFigure() {

        int length = list.size();
        for (int i = 0; i<=length; i++){
        }
        System.out.println(list);
    }
}

