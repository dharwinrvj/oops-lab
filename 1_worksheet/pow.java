import java.util.Scanner;
public class pow{
    public static void main(String args[]){
        int sum=1,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter base:");
        int a=obj.nextInt();
        System.out.println("Enter power:");
        int b=obj.nextInt();
        for(i=0;i<b;i++){
sum=sum*a;
        }
        System.out.println("Base "+a+" power "+b+" is "+sum);
    }
}