import java.util.Scanner;

public class nearint {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a real number:");
        double a=obj.nextDouble();
        nint(a);
    }
    static void nint(double a){
        System.out.println("Interger: "+Math.round(a));
        }
}