/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

/**
 *
 * @author dharwin
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class CharacterException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first addend: ");
            int a = sc.nextInt();
            System.out.print("Enter the second addend: ");
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("The sum is " + c);
        } catch (InputMismatchException e) {
            System.out.println("Exception occured: " + e + "\nThe entered input is not a number.");
        }

    }
}