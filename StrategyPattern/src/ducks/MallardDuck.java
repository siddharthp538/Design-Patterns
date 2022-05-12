package ducks;

public class MallardDuck extends Duck{
    @Override
    public void fly() {
        flyBehaviour.fly();
    }

    @Override
    public void quack() {
        quackBehaviour.quack();
    }
}
