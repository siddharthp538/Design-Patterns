package behaviours;

public class FlyNoWings extends  FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cant fly, I lost my wings");
    }
}
