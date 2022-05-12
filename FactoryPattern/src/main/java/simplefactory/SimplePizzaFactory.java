package simplefactory;

import simplefactory.pizzas.CheesePizza;
import simplefactory.pizzas.MaccoroniPizza;
import simplefactory.pizzas.Pizza;
import simplefactory.pizzas.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        if(type.equals("veggie")) return new VeggiePizza();
        else if(type.equals("cheese")) return new CheesePizza();
        else if(type.equals("maccoroni")) return new MaccoroniPizza();
        return null;
    }
}
