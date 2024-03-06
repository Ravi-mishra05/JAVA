package IntroToOops;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5]; // created and array of class Students
        // System.out.println(Arrays.toString(students)); // results is null

        Student std1;
        std1 = new Student();
        // Student student = new Student();
        // System.out.println(std1); // printing random value.

        std1.name = "ravi mishra";
        std1.rollno = 27;
        std1.marks = 45f;

        System.out.println(std1.rollno);
        System.out.println(std1.name);
        System.out.println(std1.marks);
    }

}

// outside Main Class.
class Student {
    int rollno = 100; // default values.
    String name = "empty";
    float marks = 90;
}
