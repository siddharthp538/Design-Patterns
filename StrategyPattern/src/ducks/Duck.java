package ducks;

import behaviours.FlyBehaviour;
import behaviours.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void fly();
    public abstract void quack();

}
