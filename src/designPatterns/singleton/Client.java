package designPatterns.singleton;

public class Client {

    public static void main(String[] args) {

//        DBC dbc = new DBC();

        DBC d1 = DBC.getInstance();               // d1 = DBC@704
        DBC d2 = DBC.getInstance();               // d2 = DBC@704
        ABC abc = new ABC();                      // abc = ABC@705

//        DBC.dbc = null;

//        d1.dbUrl = "psql://";
//        d1.password = "abcde";
        System.out.println(d2.password);

    }
}

// A constructor
// 1. Throw an exception
// 2. Return a NEW object
