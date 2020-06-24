package java8.epamTraining.imageProcessing;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinate move(Coordinate other) {
        return new Coordinate(x + other.x, y + other.y);
    }

}
