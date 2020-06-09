package collections.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product(null, "A bike for competition");

        Basket basket = new Basket();
        basket.addProductToBasket(eBike);
        basket.addProductToBasket(roadBike);
        Product eBikeFromBasket = basket.getProductFromBasket(eBike);
        System.out.println(eBikeFromBasket);

        Product removedProduct = basket.removeProductFromBasket(roadBike);
        System.out.println("The product is available: " + basket.isProductAvailable( removedProduct));

        Product roadBikeHasPrice = new Product("RoadBike", "A bike for competition", 900);
        Product eBikeBikeHasPrice = new Product("E-Bike", "A bike with a battery", 1500);
        Product monsterBike = new Product("MonsterBike", "The biggest bike ever", 3000);

        TreeMap<Integer, Product> reverseOrderAccordingPrice = new TreeMap<>(Comparator.reverseOrder());
        reverseOrderAccordingPrice.put(roadBikeHasPrice.getPrice(),roadBikeHasPrice);
        reverseOrderAccordingPrice.put(monsterBike.getPrice(),monsterBike);
        reverseOrderAccordingPrice.put(eBikeBikeHasPrice.getPrice(),eBikeBikeHasPrice);
        System.out.println(reverseOrderAccordingPrice);



    }
}
