package hw_7.figure;

import hw_7.Shape;

public class Diamond extends Shape {
    private String name;

    public Diamond() {
        this.name = "Diamond";
    }

    @Override
    public String getName() {
        return name;
    }
}
