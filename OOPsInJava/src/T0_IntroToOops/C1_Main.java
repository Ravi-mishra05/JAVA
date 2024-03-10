package T0_IntroToOops;

public class C1_Main {
    public static void main(String[] args) {

        // Student[] students = new Student[5]; // created and array of class Students

        Student std0 = new Student(); // prints default values
        System.out.println(std0.rollno + " " + std0.name + " " + std0.marks);

        Student std1 = new Student(); // manually entered data
        std1.name = "Ravi Mishra";
        std1.rollno = 27;
        std1.marks = 45f;
        System.out.println(std1.rollno + " " + std1.name + " " + std1.marks);

        Student std2 = new Student(27, "Ravi", 82.4f); // data provided through constructor arguement
        System.out.println(std2.rollno + " " + std2.name + " " + std2.marks);

        // std2.Greeting();
        // std2.Greeting("laddu");

        Student test = new Student(std2);
        System.out.println(test.rollno + " " + test.name + " " + test.marks);

    }

}

// outside Main Class.
class Student {
    int rollno; // default values.
    String name;
    float marks;

    void Greeting() {
        System.out.println("Hello " + this.name);
    }

    void Greeting(String name) {
        this.name = name;
        System.out.println("Hello , Hi " + name);
    }

    void ChangeName(String name) {
        this.name = name;
    }

    Student() {
        this.rollno = 100; // defaults
        this.name = "Empty";
        this.marks = 99.0f;
    }

    Student(Student random) {
        this.rollno = random.rollno; // defaults
        this.name = random.name;
        this.marks = random.marks;
    }

    Student(int rollno, String name, float marks) {
        this.rollno = rollno; // defaults
        this.name = name;
        this.marks = marks;
    }
}
