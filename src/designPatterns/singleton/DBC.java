package designPatterns.singleton;

public class DBC {

//    private static DBC dbc = null;

//    creating a object
    private static final DBC dbc = new DBC();

    static String dbUrl;
    String timeOut;
    String username;
    String password;

    private DBC () {

    }

    public static DBC getInstance () {
//        if (dbc == null) {
//            dbc = new DBC();
//        }
        return dbc;
    }
}
