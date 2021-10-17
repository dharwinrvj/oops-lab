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

public class GenericPgm {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Integer list[] = { 18, 22, 19, 20, 02, 66, 25, 17, 01 };
        System.out.println("Integer list elements are : ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        TestConditions test = new TestConditions();
        test.OddIntegers(list);
        System.out.println("Enter the position of first element to be exchanged (1-9) : ");
        int pos1 = obj.nextInt();
        System.out.println("Enter the position of second element to be exchanged (1-9) : ");
        int pos2 = obj.nextInt();
        if (pos1 > 9 || pos2 > 9 || pos1 < 0 || pos2 < 0) {
            System.out.println("Invalid position!\ni.e. Position should range from 1 to 9");
            return;
        }
        test.ExchangePositions(list, pos1, pos2);
        System.out.println("\nEnter the begin index (0-8) to find the maximal element in the specifying range : ");
        int begin = obj.nextInt();
        System.out.println("Enter the end index (0-8) to find the maximal elements in the specifying range : ");
        int end = obj.nextInt();
        if (begin > end) {
            System.out.println("\nBegin and end indices are invalid!\ni.e.Begin index is of greater value than the end index");
            return;
        }
        test.MaximalElement(list, begin, end);
    }
}

class TestConditions {
    public <T extends Integer> void OddIntegers(T[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0)
                count++;
        }
        if (count > 0)
            System.out.println("\nCount of odd integers in the integers list : " + count);
        else
            System.out.println("There are no odd integers in the list");
    }

    public <T extends Integer> void ExchangePositions(T[] list, int pos1, int pos2) {
        T temp;
        temp = list[pos1 - 1];
        list[pos1 - 1] = list[pos2 - 1];
        list[pos2 - 1] = temp;
        System.out.println("After exchanging, the integer list elements are : ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public <T extends Integer> void MaximalElement(T[] list, int begin, int end) {
        T max = list[begin];
        for (int i = begin; i <= end; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println("The maximal element in the specified range is : " + max);
    }
}