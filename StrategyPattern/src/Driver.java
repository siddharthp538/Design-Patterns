import behaviours.*;
import ducks.Duck;
import ducks.RubberDuck;

public class Driver {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        FlyBehaviour flyBehaviour = new FlyWithWings();
        QuackBehaviour quackBehaviour = new Mute();
        duck.setFlyBehaviour(flyBehaviour);
        duck.setQuackBehaviour(quackBehaviour);
        duck.fly();
        duck.quack();


    }
}
