import java.util.Scanner;
public class calci{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int c;
        double a,b;
        System.out.println("Enter 1st number"); 
        a=obj.nextDouble();
        System.out.println("Enter 2nd number");
        b=obj.nextDouble();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiply");
        System.out.println("Enter 4 for modulus");
        System.out.println("Enter 5 for reminder");
        c=obj.nextInt();
               switch (c) {
            case 1:
                System.out.println("Addition is "+(a+b));
                break;
                case 2:
                System.out.println("Subtraction is "+(a-b));
                break;
                case 3:
                System.out.println("Multiplication is "+(a*b));
                break;
                case 4:
                System.out.println("Modulus is "+(a/b));
                break;
                case 5:
                System.out.println("Quotient is "+(a%b));
                break;
            default:
            System.out.println("Invalid");
                break;
        }    }
}