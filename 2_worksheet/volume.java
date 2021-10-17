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
public class volume {

    /**
     * * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        box obj = new box();
        System.out.println("Volume:  " + (obj.x * obj.y * obj.z));
    }

}

class box {

    Scanner obj = new Scanner(System.in);

    {
        System.out.println("Enter length,breath,height:");
    }
    double x = obj.nextDouble();
    double y = obj.nextDouble();
    double z = obj.nextDouble();
}
