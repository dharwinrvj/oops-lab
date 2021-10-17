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
public class DoctorException {
    public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter doctor's id: ");
        String id = sc.nextLine();
        System.out.print("Enter doctor's name: ");
        String name = sc.nextLine();
        System.out.print("Enter doctor's department: ");
        String department = sc.nextLine();
        System.out.print("Enter doctor's age: ");
        int age = sc.nextInt();
        Doctor doc = new Doctor(id, name, age, department);
        doc.check();
    }
}

class Doctor {
    String id;
    String name;
    int age;
    String department;
    String CheckString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}1234567890";

    Doctor(String id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void check() throws AgeNotWithinRangeException, NameNotValidException {
        try {
            if (age < 25 || age > 65) {
                throw new AgeNotWithinRangeException("age is invalid");
            } else {
                System.out.println("The entered age is valid");
            }
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
        try {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (CheckString.contains(Character.toString(ch))) {
                    throw new NameNotValidException("The entered name contains number or special character");
                } else if (i == name.length() - 1)
                    System.out.println("The entered name does not contain any number or special character");
            }
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}

class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String s) {
        super(s);
    }
}

class NameNotValidException extends Exception {
    NameNotValidException(String s) {
        super(s);
    }
}