import java.util.Scanner;
public class discount{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter price:");
a=obj.nextInt();
System.out.println("Enter discount value:");
b=obj.nextInt();
c=a-(a*b/100);
        System.out.println("Discounted amount is "+c);
}}