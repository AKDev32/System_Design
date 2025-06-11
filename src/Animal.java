public class Animal implements Eatable{

    String name;
    String color;
    int age;
    int weight;

    void sayName () {
        System.out.println("My name is " + name);
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
}
