/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author dharwin
 */
public class calce {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arith obj1=new arith();
        Scanner obj=new Scanner(System.in);
    double x,y;
    System.out.println("Enter 2 numbers:");
x=obj.nextDouble();
y=obj.nextDouble();
        System.out.println("Add: "+obj1.add(x,y));
        System.out.println("Sub: "+obj1.sub(x,y));
        System.out.println("Multiply: "+obj1.mul(x,y));
        System.out.println("Modulus: "+obj1.mod(x,y));
    }
    
}
class arith{
    double add(double x,double y){
        return x+y;
    }
    double sub(double x,double y){
        return x-y;
    }
    double mul(double x,double y){
        return x*y;
    }
    double mod(double x,double y){
        return x/y;
    }
}