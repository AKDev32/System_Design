package designPatterns.singleton;

public class DBC {

//    private static DBC dbc = null;

//    creating a object
    private static DBC dbc = null;

    static String dbUrl;
    String timeOut;
    String username;
    String password;

    private DBC () {

    }

    public static DBC getInstance () {

        if (dbc == null) {
            synchronized (dbc) {
                if (dbc == null) {
                    dbc = new DBC();
                }
            }
        }
        return dbc;
    }
}
