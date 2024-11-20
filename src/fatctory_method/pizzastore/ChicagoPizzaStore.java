package fatctory_method.pizzastore;

import fatctory_method.pizza.ChicagoStyleCheesePizza;
import fatctory_method.pizza.ChicagoStyleVeggiePizza;
import fatctory_method.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        throw new IllegalArgumentException("Invalid pizza item: " + item);
    }
}
