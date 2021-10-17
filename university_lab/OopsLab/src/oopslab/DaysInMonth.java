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
public class DaysInMonth {
    public static void main(String[] args) {
        int year, month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month number (1 - 12): ");
        month = sc.nextInt();
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("Number of days is 31");
        else if ((month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Number of days is 29");
        } else if (month == 2) {
            System.out.println("Number of days is 28");
        } else
            System.out.println("Number of days is 30");
    }
}
/*
Enter a month number (1 - 12): 
2
Enter a year: 
2002
Number of days is 28
*/