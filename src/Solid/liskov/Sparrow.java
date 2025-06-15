package Solid.liskov;

public class Sparrow extends Bird{
    @Override
    public void fly() {
        throw new RuntimeException();
    }
}
