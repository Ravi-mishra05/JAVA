package T1_Basics;

public class Main {
    public static void main(String[] args) {
        Student ravi = new Student("Ravi", 1, 90, true);
        Student raju = new Student("Raju", 2, 80, true);
        Student surabhi = new Student("Surabhi", 3, 95, false);

        System.out.println(ravi.roll + " " + raju.roll + " " + surabhi.roll);
        System.out.println(Student.numberOfStudent);
        // System.out.println(surabhi.numberOfStudent);

        Greeting();

        // Singleton
        // Singleton obj1 = Singleton.getInstance();
        // Singleton obj2 = Singleton.getInstance();
        // Singleton obj3 = Singleton.getInstance();
        // here all three objects would point to same object.

        // System.out.println(obj1.name);

    }

    static void Greeting() {
        System.out.printf("Hello, Greetings to you ");
    }

}
