package beverages;

public class HouseBlend extends Beverage{
    @Override
    public double cost() {
        return 0.24;
    }

    HouseBlend(){
        desc = "House Blend Coffee";
    }
}
