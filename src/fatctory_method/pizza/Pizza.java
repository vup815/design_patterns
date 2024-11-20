package fatctory_method.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce");
        for (String topping : toppings) {
            System.out.println("Adding topping " + topping);
        }
    }

    public void bake() {
        System.out.println("baking pizza");
    }

    public void cut() {
        System.out.println("cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("boxing pizza");
    }

    public String getName() {
        return name;
    }
}
