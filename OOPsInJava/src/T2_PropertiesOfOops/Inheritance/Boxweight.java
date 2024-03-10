package T2_PropertiesOfOops.Inheritance;

public class Boxweight extends Box {
    int weight;

    Boxweight() {
        super();
        this.weight = -1;
    }

    Boxweight(int weight) {
        super(); // calls the base constructor of box.
        this.weight = 0;
    }

    Boxweight(int l, int h, int w, int weight) {
        super(l, w, h);
        this.weight = weight;
    }

    Boxweight(int l, int w, int weight) {
        super(l, w);
        this.weight = weight;
    }

    Boxweight(int l, int weight) {
        super(l);
        System.out.println("Two Inputs");
        this.weight = weight;
    }

    Boxweight(Boxweight other) {
        super(other);
        this.weight = other.weight;
    }
}
