package hw_7;

class PrintFigure implements Print {
    
    private final Shape shape;

    public PrintFigure(Shape shape) {

        this.shape = shape;
    }

    @Override
    public void printName() {

        shape.printName();
    }

}
