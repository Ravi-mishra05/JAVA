package T2_PropertiesOfOops.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box(10, 10, 10);
        // System.out.println(box1.length + " " + box1.width + " " + box1.height);
        // System.out.println("product = " + box1.length * box1.width * box1.height);

        // derived class
        // Boxweight box = new Boxweight(18, 19, 20, 40);
        // Boxweight box = new Boxweight(Boxweight box1,10);
        // System.out.println(box.length + " " + box.height + " " + box.width + " " +
        // box.weight);

        BoxPrice box = new BoxPrice(10 ,12,14,16,20);
        System.out.println(box.length + " " + box.height + " " + box.width + " " + box.weight + " " + box.price);

    }
}
