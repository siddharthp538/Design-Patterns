import beverages.Beverage;
import beverages.DarkRoast;
import decorators.Mocha;
import decorators.Whip;

public class StarBucks {
    public static void main(String[] args) {
        // Making a Double Mocha Whip DarkRoast Coffee for you.

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.cost());
    }
}
