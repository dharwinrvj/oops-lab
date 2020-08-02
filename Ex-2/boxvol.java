/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dharwin
 */
public class boxvol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        box1 obj=new box1();
        box1 obj1=new box1(2,4,6);
    }
    
}

class box1{
    double x=3,y=5,z=7;
    box1(){
        System.out.println("Length: "+x+" Breadth: "+y+" Height: "+z+"\nVolume :"+(x*y*z));
            }
    box1(double x,double y,double z){
        x=x;
        y=y;
        z=z;
        System.out.println("Length: "+x+" Breadth: "+y+" Height: "+z+"\nVolume :"+(x*y*z));
    }
}