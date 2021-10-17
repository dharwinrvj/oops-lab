import java.util.Scanner;
public class gpa{
    public static void main(String args[]){
        int a,n,i,c,tc=0;
        double g,sum=0.0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        n=obj.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter subjects-"+(i+1)+" grade and credits:");
            g=obj.nextDouble();
            c=obj.nextInt();
            sum=sum+(g*c);
            tc=tc+c;
        }
        System.out.println("GPA: "+sum/tc);
    }
}