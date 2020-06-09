package collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
    private Map<String, Product> productsByName = new HashMap<>();

    void addProductToBasket(Product product) {
        productsByName.put(product.getName(), product);
        System.out.println(productsByName);
    }

    Product getProductFromBasket(Product product) {
        return productsByName.get(product.getName());
    }

    Product removeProductFromBasket(Product product) {
        return productsByName.remove(product.getName());
    }

    Boolean isProductAvailable(Product product) {
        return productsByName.containsKey(product.getName());
    }

    public Map<String, Product> getProductsByName() {
        return productsByName;
    }
}
