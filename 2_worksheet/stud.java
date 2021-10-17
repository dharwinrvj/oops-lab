

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
public class stud {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        // TODO code application logic here
student obj[]=new student[10];
for(int i=0;i<10;i++){
    obj[i]=new student();
    obj[i].getData();
    obj[i].markCalc();
    System.out.println(obj[i].dis());
}
    }

}

class student{
    String name,dept,status;
    double avg,m1,m2,m3;
    void getData(){
        final Scanner obj=new Scanner(System.in);
        System.out.println("Enter name,department,mark1,mark2,mark3 out of 100:");
        name=obj.next();
        dept=obj.next();
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
}
    void markCalc(){
avg=(m1+m2+m3)/3;
if(m1>35&&m2>35&&m3>35){
    if(avg>75&&avg<=100){
System.out.println("First class");
    }
    else if(avg>50&&avg<=75){
        System.out.println("Second class");
            }
            else{
                System.out.println("Third class");
            }

}
    
    else{
        System.out.println("You failed in some subjects");
    }
}
String dis(){
return "Name: "+name+"\nDepartment: "+dept+"\nMark1,Mark2,Mark3: "+m1+","+m2+","+m3+"\nAverage: "+avg;
}
}