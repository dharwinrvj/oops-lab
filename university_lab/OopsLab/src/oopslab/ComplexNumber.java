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
public class ComplexNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        float num1, num2, answer;
        Complex cal = new Complex();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        System.out.println("enter the real part: ");
        num1 = input.nextInt();
        System.out.println("enter the imaginary: ");
        num2 = input.nextInt();
        Complex obj = new Complex(num1, num2);
        System.out.println("Enter the second number:");
        System.out.println("enter the real part: ");
        num1 = input.nextInt();
        System.out.println("enter the imaginary: ");
        num2 = input.nextInt();
        Complex obj1 = new Complex(num1, num2);
        System.out.println("addition ");
        cal.add(obj, obj1);
        System.out.println("subraction ");
        cal.sub(obj, obj1);
        System.out.println("multiplication ");
        cal.mult(obj, obj1);
        System.out.println("division ");
        cal.div(obj, obj1);
    }
}

class Complex {
    float real, imag;

    Complex(float comp1, float comp2) {
        real = comp1;
        imag = comp2;
    }

    Complex() {
    }

    void add(Complex c1, Complex c2) {
        this.real = (c1.real + c2.real);
        this.imag = (c1.imag + c2.imag);
        System.out.println("answer is:(" + this.real + ")+(" + this.imag + ")i");
    }

    void sub(Complex c1, Complex c2) {
        this.real = (c1.real - c2.real);
        this.imag = (c1.imag - c2.imag);
        System.out.println("answer is:(" + this.real + ")+(" + this.imag + ")i");
    }

    void mult(Complex c1, Complex c2) {
        this.real = (c1.real * c2.real - c1.imag * c2.imag);
        this.imag = (c1.real * c2.imag + c2.real * c1.imag);
        System.out.println("answer is:(" + this.real + ")+(" + this.imag + ")i");
    }

    void div(Complex c1, Complex c2) {
        float demo;
        demo = (c2.real * c2.real + c2.imag * c2.imag);
        this.real = (c1.real * c2.real + c1.imag * c2.imag) / demo;
        this.imag = (c1.real * c2.imag - c2.real * c1.imag) / demo;
        System.out.println("answer is:(" + this.real + ")+(" + this.imag + ")i");
    }
}
/*
Enter the first number
enter the real part: 
3
enter the imaginary: 
4
Enter the second number:
enter the real part: 
6
enter the imaginary: 
5
addition 
answer is:(9.0)+(9.0)i
subraction 
answer is:(-3.0)+(-1.0)i
multiplication 
answer is:(-2.0)+(39.0)i
division 
answer is:(0.6229508)+(-0.14754099)i
*/