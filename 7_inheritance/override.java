import java.util.Scanner;

public class override {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int b;
        bond obj1[] = new bond[6];
        convertilebond obj2[] = new convertilebond[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter 0 to access Bond class\nEnter 1 to access ConvertileBond class");
            b = obj.nextInt();
            switch (b) {
                case 0:
                    obj1[i] = new bond();
                    obj1[i].display();
                    break;
                case 1:
                    obj2[i] = new convertilebond();
                    obj2[i].display();
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }

    }
}

class bond {
    void display() {
        System.out.println("Bond");
    }
}

class convertilebond extends bond {
    void display() {
        System.out.println("ConvertileBond");
    }
}