package generics;

public class GenericEntry<T> {
    private T data;
    private int rank;

    public GenericEntry(T data, int rank) {
        this.data = data;
        this.rank = rank;
    }

    public T getData() {
        return data;
    }

    public int getRank() {
        return rank;
    }
}
