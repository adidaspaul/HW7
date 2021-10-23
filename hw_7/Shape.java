package hw_7;

public abstract class Shape implements Print {

    @Override
    public void printName() {
        System.out.println(getName());
    }

    public abstract String getName();
}
