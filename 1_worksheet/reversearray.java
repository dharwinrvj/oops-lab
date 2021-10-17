import java.util.Scanner;
public class reversearray{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int i,j,n,k=1;
        int a[]=new int[100];
        System.out.println("Enter number of elements:");
        n=obj.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter the element "+(i+1));
a[i]=obj.nextInt();
        }
        for(j=i-1;j>=0;j--){
            System.out.println("Element "+(k)+" is "+a[j]);
            k++;
        }
        System.out.println("Dharwin");
    }
}