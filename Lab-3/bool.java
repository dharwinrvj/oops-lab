import java.util.Scanner;

public class bool {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        boolean a[]=new boolean[3];
        int i;
        System.out.println("Enter 3 boolean values: ");
        for(i=0;i<3;i++){
            a[i]=obj.nextBoolean();
        }
        System.out.println("Value: "+check(a));
    }
    static boolean check(boolean a[]){
        int i,flag=0;
for(i=0;i<3;i++){
    if(a[i]==true){
        flag++;
    }
}
if(flag>=2){
    return true;
}
else 
{
    return false;
}
}
}