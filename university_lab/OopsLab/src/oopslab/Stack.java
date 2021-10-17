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

public class Stack {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        stack obj1 = new stack();
        System.out.println("Entering 10");
        obj1.push(10);
        obj1.display();
        System.out.println("Entering 20");
        obj1.push(20);
        obj1.display();
        System.out.println("Entering 30");
        obj1.push(30);
        obj1.display();
        System.out.println("Entering 40");
        obj1.push(40);
        obj1.display();
        System.out.println("Entering 50");
        obj1.push(50);
        obj1.display();
        System.out.println("Entering 60");
        obj1.push(60);
        obj1.display();
        System.out.println("Removing last element");
        obj1.pull();
        obj1.display();
        System.out.println("Removing last element");
        obj1.pull();
        obj1.display();
        System.out.println("Entering 70");
        obj1.push(70);
        obj1.display();

    }
}

class stack {
    int b[] = new int[5];
    int top = -1, max = 4;

    int isfull() {
        if (top == max)
            return 1;
        else
            return 0;
    }

    int isempty() {
        if (top == -1)
            return 1;
        else
            return 0;
    }

    void push(int x) {
        if (isfull() == 1)
            System.out.println("Array is full");
        else {
            top++;
            b[top] = x;
        }
    }

    void pull() {
        if (isempty() == 1)
            System.out.println("Array is empty");
        else
            top--;
    }

    void display() {
        if (isempty() == 1)
            System.out.println("Array is empty");
        else {
            System.out.println("Elements of the Array:");
            for (int i = 0; i <= top; i++) {
                System.out.println(b[i]);
            }
        }
    }
}