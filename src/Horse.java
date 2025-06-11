public class Horse extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("Horse  is running");
    }
}
