/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.*;
import oopslab.year_1.*;
import oopslab.year_2.*;

/**
 *
 * @author dharwin
 */
public class StudentPackage {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter rollnumber:");
            int rollnumber = obj.nextInt();
            System.out.println("Enter name:");
            String name = obj.next();
            System.out.println("Enter the year-1 marks:");
            Year1Marks s = new Year1Marks();
            s.display();
            System.out.println("Enter the year-2 marks:");
            Year2Marks s1 = new Year2Marks();
            s1.display();
        }
    }
}
