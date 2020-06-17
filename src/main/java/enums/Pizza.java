package enums;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {
    private static EnumSet<PizzaStatus> undeliveredPizzaStatuses =
            EnumSet.of(PizzaStatus.ORDERED, PizzaStatus.READY);

    private PizzaStatus status;

    public Pizza(PizzaStatus status) {
        this.status = status;
    }

    public boolean isDeliverable(){
        return this.status.isReady();
    }

    public int getDeliveryTimeInDays() {
       return this.status.getTimeToDelivery();
    }

    public static List<Pizza> getAllUndeliveredPizzas(List<Pizza> input) {
        return input.stream()
                .filter((s) -> undeliveredPizzaStatuses.contains(s.getStatus()))
                .collect(Collectors.toList());
    }

    public static EnumMap<PizzaStatus, List<Pizza>> groupPizzaByStatus(List<Pizza> pizzaList) {
        EnumMap<PizzaStatus, List<Pizza>> pzByStatus = new EnumMap<>(PizzaStatus.class);

        for (Pizza pizza : pizzaList) {
            PizzaStatus status = pizza.getStatus();
            if (pzByStatus.containsKey(status)) {
                pzByStatus.get(status).add(pizza);
            } else {
                pzByStatus.put(status, List.of(pizza));
            }
        }
        return pzByStatus;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "status=" + status +
                '}';
    }
}
