package methodfactory;

import methodfactory.pizzas.Pizza;
import methodfactory.pizzastores.NYPizzaStore;
import methodfactory.pizzastores.PizzaStore;

public class Driver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyCheese = nyStore.orderPizza("cheese");
    }
}
