package beverages;

public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return 0.50;
    }
    public DarkRoast(){
        desc = "Dark Roast Coffee";
    }
}
