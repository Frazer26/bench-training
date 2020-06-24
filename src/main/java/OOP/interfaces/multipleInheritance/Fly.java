package OOP.interfaces.multipleInheritance;

public interface Fly {
    void fly();

    default void speed() {
        System.out.println("Flying speed");
    }
}
