package ducks;

public class RubberDuck extends Duck {

    @Override
    public void fly() {
        flyBehaviour.fly();
    }

    @Override
    public void quack() {
        quackBehaviour.quack();
    }
}
