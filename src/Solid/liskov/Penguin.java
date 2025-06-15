package Solid.liskov;

public class Penguin extends Bird{

    @Override
    public void fly() {
        throw new FlyBehaviourNotSupportedException();
    }
}
