package enums;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(PizzaStatus.DELIVERED);
        Pizza pizza1 = new Pizza(PizzaStatus.READY);
        Pizza pizza2 = new Pizza(PizzaStatus.READY);
        Pizza pizza3 = new Pizza(PizzaStatus.ORDERED);
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(pizza);
        pizzaList.add(pizza1);
        pizzaList.add(pizza2);
        pizzaList.add(pizza3);

        List<Pizza> undeliveredPizzas = Pizza.getAllUndeliveredPizzas(pizzaList);
        System.out.println(undeliveredPizzas.size());

        System.out.println(Color.valueOf("GREEN"));
        System.out.println(Color.GREEN);
        System.out.println(Color.valueOfLabel("red"));

        System.out.println(Element.valueOfLabel("Helium"));
    }
}
