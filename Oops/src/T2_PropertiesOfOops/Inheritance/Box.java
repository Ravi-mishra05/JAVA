package T2_PropertiesOfOops.Inheritance;

public class Box {
    int length;
    int width;
    int height;

    Box() {
        System.out.println("default box");
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(int length, int width) {
        System.out.println("rectangle");
        this.length = length;
        this.width = width;
        this.height = -1;
    }

    Box(int side) {
        System.out.println("cube");
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(int length, int width, int height) {
        System.out.println("cuboid");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // special
    Box(Box other) {
        System.out.println("copying an old box into new");
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

}
