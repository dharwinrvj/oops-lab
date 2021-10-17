/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.ArrayList;

/**
 *
 * @author dharwin
 */
public class RandomArray {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList am = new ArrayList();
        ArrayList an = new ArrayList();
        int min = 10;
        int max = 90;
        int avg = 0;
        // adding elements and simultaneously finding average
        for (int j = 0; j < 20; j++) {
            int pick = (int) (Math.random() * (max - min + 1) + min);
            al.add(pick);
            avg = avg + pick;
        }
        avg = avg / 20;
        System.out.println("Contents of al: " + al);
        System.out.println("The average is " + avg);
        // finding elements above average
        for (int j = 0; j < 20; j++) {
            int a = (int) al.get(j);
            if (a > avg) {
                am.add(a);
            } else
                an.add(a);
        }
        System.out.println("Contents of the main array: " + al);
        System.out.println("Contents greater than average: " + am);
        System.out.println("Contents lesset than average: " + an);
    }
}
