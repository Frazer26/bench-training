package OOP.polymorphism;

public class Circle implements Shape {
    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
