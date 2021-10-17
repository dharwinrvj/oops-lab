import java.util.Scanner;
public class larof3{
    public static void main(String args[]){
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a=obj.nextInt();
        System.out.println("Enter 2nd number:");
        b=obj.nextInt();
        System.out.println("Enter 3rd number:");
        c=obj.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" is largest");
        }
        else if(b>c){
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
}