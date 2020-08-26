import java.util.Scanner;

public class measure {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter dimension:");
        int a = obj.nextInt();
        cir obj1 = new cir(a);
        obj1.circle();
        sq obj2 = new sq(a);
        obj2.square();
        sp obj3 = new sp(a);
        obj3.sphere();
    }
}

class shape {
    double d;

    shape(double d) {
        this.d = d;
    }
}

class cir extends shape {
    cir(double d) {
        super(d);
    }

    void circle() {
        System.out.println("Area of circle: " + (Math.PI * d * d));
        System.out.println("Circumference of circle: " + (Math.PI * d * 2));
    }
}

class sq extends shape {
    sq(double d) {
        super(d);
    }

    void square() {
        System.out.println("Area of square: " + (d * d));
        System.out.println("Circumference of square: " + (4 * d));
    }
}

class sp extends shape {
    sp(double d) {
        super(d);
    }

    void sphere() {
        System.out.println("Volume of sphere: " + (4 / 3 * Math.PI * d * d * d));
        System.out.println("Surface area of shphere: " + (Math.PI * d * d * 4));
    }
}