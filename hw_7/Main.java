package hw_7;

import hw_7.figure.*;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Diamond();
        shapes[3] = new Triangle();
        shapes[4] = new Quad();

        for (Shape shape : shapes) {
            new PrintFigure(shape).printName();
        }

    }

}
