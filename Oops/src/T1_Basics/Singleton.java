package T1_Basics;

public class Singleton {
    static int num;
    static String name;

    private Singleton(int num, String name) {
        Singleton.num = num;
        Singleton.name = name;
    }

    private static Singleton instance;

    public static Singleton getInstance(int num, String name) {
        if (instance == null) {
            instance = new Singleton(num, name);

        }
        return instance;
    }
}
