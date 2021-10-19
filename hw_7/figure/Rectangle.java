package hw_7.figure;

import hw_7.Shape;

public class Rectangle extends Shape {
    private String name;

    public Rectangle() {

        this.name = "Rectangle";
    }

    @Override
    public String getName() {
        return name;
    }
}
