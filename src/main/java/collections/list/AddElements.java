package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddElements {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>(Arrays.asList(
                new Flower("Camelia", 12),
                new Flower("Rose", 8),
                new Flower("Trifolium repens", 4)));

        List<Flower> anotherFlowers = new ArrayList<>();
        anotherFlowers.addAll(flowers);
        boolean isContainsFlowers = anotherFlowers.containsAll(flowers);
        System.out.println("'AnotherFlowers' contains 'flowers' elements: " + isContainsFlowers);

        Flower flower = anotherFlowers.get(0);
        flower.setPetals(flowers.get(0).getPetals() * 3);
        anotherFlowers.containsAll(flowers);
        System.out.println("Modified first flower and 'AnotherFlowers' contains 'flowers' elements: " + isContainsFlowers);

        List<Flower> target = new ArrayList<>();
        Collections.addAll(target, flowers.get(0), flowers.get(1), flowers.get(2), flowers.get(0));
        System.out.println("Target size: " + target.size());
    }
}
