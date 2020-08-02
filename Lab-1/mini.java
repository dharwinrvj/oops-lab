import java.util.Scanner;

public class mini {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 2 numbers:");
        a = obj.nextInt();
        b = obj.nextInt();
        int c = a < b ? a : b;
        System.out.println("Minimum number: " + c);
    }
}