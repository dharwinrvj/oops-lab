import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = obj.nextInt();
        int rem = 0, rev = 0, temp = 0;
        temp = a;
        while (a > 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + " is not palindrome");
        }
    }
}