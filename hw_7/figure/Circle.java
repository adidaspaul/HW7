package hw_7.figure;

import hw_7.Shape;

public class Circle extends Shape {

    private String name;

    public Circle() {

        this.name = "Circle";
    }

    @Override
    public String getName() {

        return name;
    }

}
