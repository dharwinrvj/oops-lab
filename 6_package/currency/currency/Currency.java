/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;
import java.util.Scanner;
import i2d.*;
import i2e.*;
import i2y.*;
import d2i.*;
import e2i.*;
import y2i.*;
import java.lang.*;

/**
 *
 * @author 
 */
public class Currency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        double n;
        
        System.out.print("Enter 1 to convert Dollars to Rupees\nEnter 2 to convert Euro to Rupees\nEnter 3 to convert Yarn to Rupees\nEnter 4 to convert Rupees to Dollar,Euro,Yarn\n");
        int a=obj.nextInt();
        switch(a){
            case 1:{
                System.out.print("Enter Dollar value:");
n=obj.nextDouble();
d2i obj1=new d2i(n);
break;
            }
            case 2:{
                System.out.print("Enter Euro value:");
n=obj.nextDouble();
e2i obj1=new e2i(n);
break;
            }
            case 3:{
                System.out.print("Enter Yarn value:");
n=obj.nextDouble();
y2i obj1=new y2i(n);
break;
            }
            case 4:{
                System.out.print("Enter Indian value:");
n=obj.nextDouble();
i2d obj1=new i2d(n);
i2e obj2=new i2e(n);
i2y obj3=new i2y(n);
break;
            }
            default:{
                System.out.print("Invalid value");
            }
            
        }
    }
    
}
