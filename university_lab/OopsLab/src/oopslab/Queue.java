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
public class Queue {

    public static void main(String[] args) {

        int i, a;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter no. of queue value");
        int n = s.nextInt();

        queueoperations obj = new myqueue(n);

        System.out.println("Enter the queue value to be inserted");
        for (i = 0; i < n; i++) {
            a = s.nextInt();
            obj.enqueue(a);
        }
        System.out.println("displaying queue ");
        obj.display();

        for (i = 0; i < n; i++) {
            obj.dequeue();
        }
        System.out.println("displaying queue ");
        obj.display();
        System.out.println("the size of the queue is" + obj.size());
        s.close();
    }

}

interface queueoperations {
    void enqueue(int value);

    void dequeue();

    void display();

    int size();
}

class myqueue implements queueoperations {
    int a[] = new int[100];
    public int front = -1, rear = -1, i = 0, n, count = 0;

    myqueue(int n) {
        this.n = n;
    }

    public void enqueue(int value) {
        if (isfull() == 1) {
            System.out.println("The queue is full");
        } else {
            if (front == -1)
                front = 0;
            System.out.printf("inserting %d into the queue \n", value);
            rear = rear + 1;
            a[rear] = value;
            count++;
        }
    }

    public void dequeue() {
        if (isempty() == 1) {
            System.out.println("the queue is empty");
        } else {
            if (front == rear) {
                System.out.printf("deleting %d value from the queue \n", a[front]);
                front = 0;
                rear = 0;
                count--;
            } else {
                System.out.printf("deleting %d value from the queue \n", a[front]);
                front++;
                count--;
            }
        }

    }

    int isfull() {
        if (rear == n - 1)
            return 1;
        else
            return 0;
    }

    int isempty() {
        if (front == 0 && rear == 0)
            return 1;
        else
            return 0;
    }

    public int size() {
        return count;
    }

    public void display() {
        System.out.printf("front=%d and rear=%d\n", front, rear);
        if (isempty() == 1) {
            System.out.println("the queue is empty");
        } else {
            System.out.println("the queue is ");
            for (i = front; i <= rear; i++) {
                System.out.println(a[i]);
            }
        }

    }

}