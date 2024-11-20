package fatctory_method.pizzastore;

import fatctory_method.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // factory method
    protected abstract Pizza createPizza(String type);
}
