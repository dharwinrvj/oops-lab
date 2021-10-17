import java.util.Scanner;

public class digtonum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = obj.nextInt();
        int rev = 0, rem = 0;
        while (a > 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        while (rev > 0) {
            rem = rev % 10;
            if (rem == 1)
                System.out.print(" one");
            if (rem == 2)
                System.out.print(" two");
            if (rem == 3)
                System.out.print(" three");
            if (rem == 4)
                System.out.print(" four");
            if (rem == 5)
                System.out.print(" five");
            if (rem == 6)
                System.out.print(" six");
            if (rem == 7)
                System.out.print(" seven");
            if (rem == 8)
                System.out.print(" eight");
            if (rem == 9)
                System.out.print(" nine");
            if (rem == 0)
                System.out.print(" zero");
            rev = rev / 10;
        }
        System.out.print("\n");
    }
}