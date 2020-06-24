package OOP.inheritance;

public class ArmoredCar extends Car {
    int bulletProofWindows;

    void remoteStarterCar() {
        System.out.println("Can be started by using a remote control");
    }

    public String registerModel() {
        return model;
    }

    public static String msg() {
        return "ArmoredCar";
    }
}
