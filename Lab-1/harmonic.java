import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int a = obj.nextInt();
        double s = 0.0;
        for (double i = 1; i <= a; i++)
            s = s + (1 / i);
        System.out.println(s);
    }
}