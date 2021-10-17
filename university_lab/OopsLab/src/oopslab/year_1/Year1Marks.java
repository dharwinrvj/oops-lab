/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab.year_1;

import java.util.*;

/**
 *
 * @author dharwin
 */
public class Year1Marks {
    public void display() {
        Scanner obj = new Scanner(System.in);
        int sub1mark = obj.nextInt();
        int sub2mark = obj.nextInt();
        System.out.println("Mark 1:" + sub1mark);
        System.out.println("Mark 2:" + sub2mark);
        if (sub1mark > 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        if (sub2mark > 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
