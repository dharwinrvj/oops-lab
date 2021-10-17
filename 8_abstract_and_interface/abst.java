
import java.util.Scanner;

public class abst {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        book obj1[] = new Mybook[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter book name,author,price:");
            String n = obj.next();
            String t = obj.next();
            double p = obj.nextDouble();
            obj1[i] = new Mybook();
            obj1[i].setdetails(n, t, p);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(obj1[i].gettitle());

        }
        System.out.println("Total price:" + (obj1[0].price + obj1[1].price + obj1[2].price));

    }

}

abstract class book {
    String title;
    String name;
    double price;

    abstract void setdetails(String n, String t, double p);

    String gettitle() {
        return title;
    }
}

class Mybook extends book {

    @Override
    void setdetails(String n, String t, double p) {
        this.name = n;
        this.title = t;
        this.price = p;
        System.out.println("Name:" + name);
        System.out.println("Title:" + title);
        System.out.println("Price:" + price);

    }

}