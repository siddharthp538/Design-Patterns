package simplefactory;

import simplefactory.pizzas.Pizza;

public class Driver {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("veggie");
    }
}
