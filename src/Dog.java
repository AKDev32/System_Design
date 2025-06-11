public class Dog extends Animal implements Runnable {

    String bread;
    String hairColor;

    void bark () {
        System.out.println("Bhow");
    }

    @Override
    public void sayName() {
//        super.sayName();
        System.out.println("Bhow Bhow Bhow saying name");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
