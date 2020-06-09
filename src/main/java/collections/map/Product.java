package collections.map;

import java.util.List;

public class Product {
    private String name;
    private String description;
    private int price;
    private List<String> tags;

    Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Product(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
