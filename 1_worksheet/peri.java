import java.util.Scanner;
public class peri{
    public static void main(String args[]){
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of square's side:");
        a=obj.nextInt();
        System.out.println("Perimeter is "+4*a);
    }
}