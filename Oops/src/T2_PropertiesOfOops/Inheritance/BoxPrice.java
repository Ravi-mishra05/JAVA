package T2_PropertiesOfOops.Inheritance;

public class BoxPrice extends Boxweight {
    int price;

    public BoxPrice() {
        super();
        this.price = -1;
    }

    public BoxPrice(int price) {
        super();
        this.price = price;
    }

    public BoxPrice(int height, int width, int length, int weight, int price) {
        super(height, width, length, weight);
        this.price = price;
    }

}
