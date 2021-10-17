import java.util.Scanner;
public class distance{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double x1,x2,y1,y2,d;
        System.out.println("Enter the value of point A:");
        x1=obj.nextDouble();
        y1=obj.nextDouble();
        System.out.println("Enter the value of point B:");
        x2=obj.nextDouble();
        y2=obj.nextDouble();
        d=Math.sqrt(Math.pow(x1-x2, 2)*Math.pow(y1-y2, 2));
        System.out.println("Distance is "+d);
}
}