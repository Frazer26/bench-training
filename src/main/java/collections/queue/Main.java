package collections.queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();

        integerQueue.offer(9);
        integerQueue.offer(2);
        integerQueue.offer(4);

        System.out.println(integerQueue);
        int first = integerQueue.poll();
        int second = integerQueue.poll();
        integerQueue.offer(1);
        int third = integerQueue.poll();
        int fourth = integerQueue.poll();
        System.out.println(first + " "+ second + " " + third + " " + fourth);
        System.out.println(integerQueue.size());
    }
}
