package com.kodilla.testing.shape;
import java.util.LinkedList;

public class ShapeCollector {

    LinkedList<Shape> list = new LinkedList<>();

    public Shape addFigures (Shape shape) {

        list.add(new Circle(shape.getName(),shape.getField()));
        list.add(new Triangle(shape.getName(),shape.getField()));
        list.add(new Square(shape.getName(),shape.getField()));
        return shape;
    }

    public Shape removeFigures(Shape shape) {

        list.remove(new Circle(shape.getName(),shape.getField()));
        list.remove(new Triangle(shape.getName(),shape.getField()));
        list.remove(new Square(shape.getName(),shape.getField()));
        return shape;
    }

    public Shape getFigures(LinkedList<Shape> list, int i) {

        return list.get(i);
    }
    public void showFigures() {

        System.out.println(list);
    }
}

