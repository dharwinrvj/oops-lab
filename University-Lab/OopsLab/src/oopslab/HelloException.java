/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.Scanner;

/**
 *
 * @author dharwin
 */
public class HelloException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an input: ");
        String str = sc.nextLine();
        try {
            check(str);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }

    static void check(String str) throws myException {
        if (str.equals("hello"))
            throw new myException("The input string is 'hello'");
        else
            System.out.println("No exception.  The input string is not 'hello'");
    }
}

class myException extends Exception {
    myException(String s) {
        super(s);
    }
}
