package methodfactory.pizzastores;

import methodfactory.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new ChicagoCheesePizza();
        if(type.equals("veggie"))
            return new ChicagoVeggiePizza();
        return null;
    }
}
