import java.util.Scanner;
public class asces{
    public static void main(String args[]){
        int a[]=new int[100];
        int n,i,j,temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers of elements:");
        n=obj.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter the numbers - "+(i+1));
            a[i]=obj.nextInt();
        }
for(i=0;i<n;i++){
    for(j=i+1;j<n;j++){
        if(a[i]>a[j]){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
for(i=0;i<n;i++){
    System.out.println("Element - "+(i+1)+": "+a[i]);
}           }
}