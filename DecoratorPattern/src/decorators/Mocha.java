package decorators;

import beverages.Beverage;

public class Mocha extends Beverage {
    Beverage beverage;
    @Override
    public double cost() {
        return beverage.cost() + 0.80;
    }

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

}
