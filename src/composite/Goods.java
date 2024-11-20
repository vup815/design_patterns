package composite;

public record Goods(Integer price, String name) implements Product {

    @Override
    public void add(Product product) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Product product) {
        throw new UnsupportedOperationException();
    }
}
