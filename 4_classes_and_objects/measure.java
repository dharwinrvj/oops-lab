import java.util.Scanner;

class measure {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float l, b;
        System.out.println("Enter length and breadth:");
        l = obj.nextFloat();
        b = obj.nextFloat();
        rect obj1 = new rect(l, b);
        System.out.println("Length: " + obj1.getLength());
        System.out.println("Breadth: " + obj1.getWidth());
        System.out.println("Set length: 10\nSet breadth: 11.22");
        obj1.setLength(10f);
        obj1.setWidth(11.22f);
        System.out.println("Area: " + obj1.getArea());
        System.out.println("Perimeter: " + obj1.getPeri());
        System.out.println(obj1.toString());
    }
}

class rect {
    float len, bre;

    rect(float l, float b) {
        len = l;
        bre = b;
    }

    float getLength() {
        return len;
    }

    void setLength(float l) {
        len = l;
    }

    float getWidth() {
        return bre;
    }

    void setWidth(float b) {
        bre = b;
    }

    float getArea() {
        return len * bre;
    }

    float getPeri() {
        return 2 * (len + bre);
    }

    public String toString() {
        return "Rectangle's length and breadth: " + len + " and " + bre;
    }
}