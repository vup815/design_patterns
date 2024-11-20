package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Product {
    private final List<Product> products = new ArrayList<>();

    @Override
    public Integer price() {
        return products.stream().mapToInt(Product::price).sum();
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
    }
}
