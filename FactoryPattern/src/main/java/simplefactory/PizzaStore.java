package simplefactory;

import simplefactory.pizzas.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;
    PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
