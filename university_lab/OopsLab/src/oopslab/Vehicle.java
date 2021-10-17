/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.*;

/**
 *
 * @author dharwin
 */

public class Vehicle {

    public static void main(String[] args) { // main class
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("For Transportvehicle enter 1");
        System.out.println("For Privatevehicle enter 2");

        int ch = obj.nextInt();
        switch (ch) {
            // getting user choice
            case 1:
                System.out.println("Enter the total number of Transport vehicle");
                int n = obj.nextInt();
                car a[] = new transportvehicles[n]; // array of objects for Tranport vehicle
                double validity_no;
                double start_date;
                int period;
                for (int i = 0; i < n; i++) {
                    // getting Transport vehicle details and displaying them
                    System.out.println("Enter the details for Transport vehicle - " + (i + 1));
                    System.out.println("Enter the validity_no:");
                    validity_no = obj.nextDouble();
                    System.out.println("Enter the start date");
                    start_date = obj.nextDouble();
                    System.out.println("Enter the period");
                    period = obj.nextInt();

                    a[i] = new transportvehicles(validity_no, start_date, period);
                    a[i].display();
                    a[i].getdata1();
                }
                break;

            case 2:
                // getting Private vehicle details and displaying them
                System.out.println("Enter the Total number of Private vehicle");
                int n1 = obj.nextInt();
                privatevehicle a1[] = new privatevehicle[n1]; // array of objects for Private vehicle
                String ow_name;
                String ow_address;
                for (int i = 0; i < n1; i++) {
                    System.out.println("Enter the details for Private vehicle - " + (i + 1));
                    System.out.println("Enter the owner name:");
                    ow_name = obj.next();
                    System.out.println("Enter the owner address");
                    ow_address = obj.next();
                    a1[i] = new privatevehicle(ow_name, ow_address);
                    a1[i].display();
                    a1[i].getdata1();
                }
                break;

            default:

                System.out.println("Enter the correct Input");

        }
    }
}

abstract class car { // abstract class

    int reg_no;
    String model;
    double reg_date;

    public void display() {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter register number:");
        reg_no = obj2.nextInt();
        System.out.println("Enter the model of the vehicle:");
        model = obj2.next();
        System.out.println("Enter the registered month and year in (x.yyyy)format:");
        reg_date = obj2.nextDouble();
        System.out.println("Register number:" + reg_no + "\nModel:" + model + "\nReg_date:" + reg_date);
    }

    abstract public void getdata1();

}

class transportvehicles extends car { // derived class from car

    double validity_no;
    double start_date;
    int period;

    // constructor
    transportvehicles(double vn, double sd, int p) {
        validity_no = vn;
        start_date = sd;
        period = p;
    }

    public void getdata1() {
        System.out.println("Validity_no:" + validity_no);
        System.out.println("Start_date:" + start_date);
        System.out.println("Period:" + period);
    }

}

class privatevehicle extends car { // derived class from car
    String ow_name;
    String ow_address;

    // constructor
    privatevehicle(String own, String owad) {
        ow_name = own;
        ow_address = owad;
    }

    public void getdata1() {
        System.out.println("Owner name:" + ow_name);
        System.out.println("Owner address:" + ow_address);
    }

}