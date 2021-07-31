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
public class InvokeObjects {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        String firstname;
        String lastname;
        System.out.println("Enter first name:");
        firstname = obj.nextLine();
        System.out.println("Enter last name:");
        lastname = obj.nextLine();
        String lname = lastname.substring(0, 4);
        String fname = firstname.substring(0, 3);
        String a = fname.concat(".");
        String b = a.concat(lname);
        String email = b.concat("@gmail.com");
        System.out.println("email= " + email);
    }
}