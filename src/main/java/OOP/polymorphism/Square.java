package OOP.polymorphism;

public class Square implements Shape {
    @Override
    public String name() {
        return "Square";
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
