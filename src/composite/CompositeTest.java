package composite;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompositeTest {
    @Test
    public void test_one_level_of_products() {
        Product product = mockProduct();
        expect_price_tobe(1500, product);
    }

    @Test
    public void test_two_level_of_products() {
        Product box = mockProduct();
        box.add(mockProduct());
        expect_price_tobe(3000, box);
    }

    @Test
    public void test_remove_products() {
        Product innerBox = mockProduct();
        Product outerBox = new Box();
        outerBox.add(innerBox);
        expect_price_tobe(1500, outerBox);
        outerBox.remove(innerBox);
        expect_price_tobe(0, outerBox);
    }

    private static void expect_price_tobe(int expected, Product outerBox) {
        Assertions.assertEquals(expected, outerBox.price());
    }


    private static Product mockProduct() {
        Product product = new Box();
        product.add(new Goods(100, "milk"));
        product.add(new Goods(200, "cheese"));
        product.add(new Goods(300, "nuts"));
        product.add(new Goods(400, "bread"));
        product.add(new Goods(500, "beer"));
        return product;
    }
}
