package OOP.interfaces.multipleInheritance;

public class Robot implements Fly, Transform {
    @Override
    public void transform() {
        System.out.println("I can Fly!");
    }

    @Override
    public void fly() {
        System.out.println("I can transform!");
    }

    @Override
    public void speed() {
        Fly.super.speed();
    }
}
