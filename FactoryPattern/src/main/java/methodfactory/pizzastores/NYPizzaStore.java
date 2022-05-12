package methodfactory.pizzastores;

import methodfactory.pizzas.NYCheesePizza;
import methodfactory.pizzas.NYVeggiePizza;
import methodfactory.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore{


    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new NYCheesePizza();
        if(type.equals("veggie"))
            return new NYVeggiePizza();
        return null;
    }
}
