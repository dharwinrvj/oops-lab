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
interface CreditCardInterface {

    void viewCreditAmount();

    void viewPin();

    void changePin(int n);

    void payBalance();
}

class customer implements CreditCardInterface {

    String name;
    long cardNumber;
    int pin;
    double creditAmount;
    double pay;
    Scanner obj = new Scanner(System.in);

    customer() {
        System.out.println("enter name, card number, pin, creditAmount, paybalance");
        name = obj.next();
        cardNumber = obj.nextLong();
        pin = obj.nextInt();
        creditAmount = obj.nextDouble();
        pay = obj.nextDouble();
    }

    public void viewCreditAmount() {
        System.out.println("CreditAmount: " + creditAmount);
    }

    public void viewPin() {
        System.out.println("your pin: " + pin);
    }

    public void changePin(int n) {
        pin = n;
    }

    public void payBalance() {

        System.out.println("pay balance of " + this.name + " is " + this.pay);
    }

}

public class CreditCard {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner obj1 = new Scanner(System.in);
        int m;
        customer obj[] = new customer[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("customer - " + (i + 1));
            obj[i] = new customer();
            obj[i].payBalance();
            System.out.println("enter 1 to change your pin number");
            int n = obj1.nextInt();
            if (n == 1) {
                System.out.println("enter new pin");
                m = obj1.nextInt();
                obj[i].changePin(m);
            }
            obj[i].viewPin();
            obj[i].viewCreditAmount();
        }

    }
}
