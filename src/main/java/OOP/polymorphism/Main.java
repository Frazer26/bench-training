package OOP.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        Shape circleShape = new Circle();
        Shape squareShape = new Square();

        shapeList.add(circleShape);
        shapeList.add(squareShape);

        for (Shape shape: shapeList) {
            System.out.println(shape.name());
        }
    }
}
