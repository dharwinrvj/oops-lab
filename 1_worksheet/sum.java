import java.util.Scanner;
public class sum{
    public static void main(String args[]){
        int a,sum=0,i;
Scanner obj=new Scanner(System.in);
System.out.println("Enter a natural number:");
a=obj.nextInt();
for(i=1;i<=a;i++){
    sum=sum+i;
}
        System.out.println("Sum of first "+a+" natural numbers is "+sum);
    }
}