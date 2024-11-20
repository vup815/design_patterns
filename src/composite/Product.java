package composite;

public interface Product {
    Integer price();
    void add(Product product);
    void remove(Product product);
}
