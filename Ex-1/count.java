import java.util.Scanner;
public class count{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a,i,n,pos=0,neg=0,zer=0,invalid=0;
        System.out.println("Enter number of elements:");
        a=obj.nextInt();
        System.out.println("Enter the numbers:");
for(i=0;i<a;i++){
        n=obj.nextInt();
    if(n>0)pos++;
    else if(n<0)neg++;
    else if(n==0)zer++;
    else{
        invalid++;
    } 
}
      System.out.println("Positive numbers - "+pos+"\nNegstive numbers - "+neg+"\nZeros - "+zer);
    }
}