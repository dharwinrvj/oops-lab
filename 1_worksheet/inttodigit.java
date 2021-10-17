import java.util.Scanner;
public class inttodigit{
    public static void main(String args[]){
        int n,d,i=0,j;
        int a[]=new int[10];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a natural number:");
n=obj.nextInt();
while(n>0){
d=n%10;
a[i]=d;
n=n/10;
i++;
}
System.out.println("Digits are");
for(j=i-1;j>=0;j--){
    System.out.println(a[j]);
}
    }
}