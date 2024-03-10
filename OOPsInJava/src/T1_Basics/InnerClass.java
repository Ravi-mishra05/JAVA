package T1_Basics;

public class InnerClass {
    static class Test {
        int num;

        Test(int num) {
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Test a = new Test(10);
        Test b = new Test(20);

        System.out.println(a.num + " " + b.num);
    }
}
