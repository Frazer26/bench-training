package OOP.interfaces.multipleInheritance;

public interface Transform {
    void transform();

    default void speed() {
        System.out.println("Transformation speed");
    }
}
