package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private int field;
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }

    public Circle(String name, int field) {
        this.name = name;
        this.field =field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return field == circle.field &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, field);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
