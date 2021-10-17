import java.util.Scanner;
public class fibo{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=0,b=1,c,i,n;
        System.out.println("Enter the number of terms:");
        n=obj.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(i=2;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }    }
}