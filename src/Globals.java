public class Globals {
    public static String driver = "";
    public static String OsInfo = "";
    private static String username = "";
    private static String password = "";
    public static boolean doubleLogin = false;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Globals.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Globals.password = password;
    }



}
