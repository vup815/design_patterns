package fatctory_method.pizzastore;

import fatctory_method.pizza.NYStyleCheesePizza;
import fatctory_method.pizza.NYStyleVeggiePizza;
import fatctory_method.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        throw new IllegalArgumentException();
    }
}
