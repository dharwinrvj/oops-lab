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
public class OopsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int marks[] = new int[5];
        int i;
        float total = 0, avg;
        System.out.println("ENTER THE MARKS OF 5 SUBJECTS !");
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.print("Marks of Subject" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        System.out.println("TOTAL mark of 5 subjects:" + total);
        avg = total / 5;
        if (avg >= 91 && avg <= 100) {
            System.out.println("Grade Point=10 Letter Grade=O(Outstanding)");
        }
        if (avg >= 81 && avg <= 90) {
            System.out.println("Grade Point=9 Letter Grade=A+(Excellent) ");
        }
        if (avg >= 71 && avg <= 80) {
            System.out.println("Grade Point=8 Letter Grade=A(Very Good) ");
        }
        if (avg >= 61 && avg <= 70) {
            System.out.println("Grade Point=7 Letter Grade=B+(Good) ");
        }
        if (avg >= 50 && avg <= 60) {
            System.out.println("Grade Point=6 Letter Grade=B(Average) ");
        }
        if (avg < 50) {
            System.out.println("Grade Point=0 Letter Grade= RA");
        }

    }

}
