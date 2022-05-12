package decorators;

import beverages.Beverage;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
}
