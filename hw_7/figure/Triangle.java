package hw_7.figure;

import hw_7.Shape;

public class Triangle extends Shape {
    private String name;

    public Triangle() {
        this.name = "Triangle";
    }

    @Override
    public String getName() {
        return name;
    }
}
