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
public class TestThreadMany extends Thread {
    public static void main(String[] args) {
        int argsize = Integer.parseInt(args[0]);
        Thread myThreads[] = new Thread[argsize];
        for (int j = 0; j < argsize; j++) {
            myThreads[j] = new Thread(new wThreads(j));
            myThreads[j].start();
        }
    }
}

class wThreads implements Runnable {
    int i;

    public wThreads(int i) {
        this.i = i + 1;
    }

    public void run() {
        System.out.println("Hello, I am Thread #" + i);
    }

}
