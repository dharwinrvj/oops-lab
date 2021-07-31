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
public class HighLow extends Thread {
    public void run() {
        System.out.println("running thread name is: " + Thread.currentThread().getName() + " and its priority is: "
                + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        HighLow m1 = new HighLow();
        HighLow m2 = new HighLow();
        m1.setName("Thread - 1");
        m2.setName("Thread - 2");
        m1.setPriority(Thread.MIN_PRIORITY); // 1
        m2.setPriority(Thread.MAX_PRIORITY); // 10
        m1.start();
        m2.start();
    }
}