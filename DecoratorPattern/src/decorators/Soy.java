package decorators;

import beverages.Beverage;

public class Soy extends CondimentDecorator{
    Beverage beverage;
    @Override
    public double cost() {
        return beverage.cost() + 1.2;
    }
    Soy(Beverage beverage){
        this.beverage = beverage;
    }
}
