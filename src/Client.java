import java.util.List;

public class Client {

    public static Animal createHusky () {
        return new Husky ();
    }


    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "aman";
        a.age = 21;
        a.color = "Yellow";
        a.sayName();

        Dog d = new Dog();
        d.name = "Tommy";
        d.age = 5;
        d.color = "Black&White";
        d.bread = "Lab";
        d.bark();
        d.sayName();

        a = d;

        a = new Cat();
        a = new Husky();

        Animal gh = new Dog();
        gh = new Cat();
//        You don't need to know the exact data type on an object.
//        You will be able to use the properties/ behaviours that you need.

//        gh.breed = "Lab";   Not allowed to use the Dog class attributes
//        gh.bark();


//        List<Animal> animals =
//                 List.of (
//                         new Dog(),
//                        new Cat(),
//                        new Dolphin(),
//                        new Husky()
//                );


//        for (Animal as : animals) {
//            as.weight = 10;
//        }

        Animal ef = createHusky();   // Factory Design Pattern
        ef.name = "Tommy2";
        ef.sayName();
//        Husky (implementation of the Dog)
//        Dog (implement is of Animal unless I override)
//        Husky -> Dog -> Animal -> Object

        Runnable afg = new Dog();
        afg.run();
        Runnable ghi = new Horse();
        ghi.run();

        Runnable ijk = new Husky();
        ijk.run();
        Runnable lmn = new Pug();
        lmn.run();
    }
}