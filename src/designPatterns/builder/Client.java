package designPatterns.builder;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
//        Map<ParamValues, Object> mp = new HashMap<>();
//        mp.put(ParamValues.name, "aman");
//        mp.put(ParamValues.age, 20);

        StudentHelper helper = new StudentHelper();
        helper.name = "aman";
        helper.age = 20;

        Student student = new Student(helper);

        Student s = Student.getBuilder()
                .setAge(20)
                .setName("aman")
                .setPhone("1234")
                .setBatch("June2025")
                .built();
    }
}

// Builder Design Pattern

// Journey
// we have a lot of parameter
// Instead of constructor, we passed a map
// Issues: TypeCasting, Typos
// Solves Typos: ENUMS
// Solves TypeCasting:
// Separate Class
// Code Duplication
// Inner Class