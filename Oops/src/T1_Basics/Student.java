package T1_Basics;

public class Student {
    String name;
    int roll;
    int percentage;
    boolean male;
    static int numberOfStudent;

    Student(String name, int roll, int percentage, boolean male) {
        this.name = name;
        this.roll = roll;
        this.percentage = percentage;
        this.male = male;
        Student.numberOfStudent += 1;
    }
}

