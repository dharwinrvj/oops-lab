/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.util.*;
import com.loan.LoanAccount;
/**
 *
 * @author dharwin
 */
public class Com {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int credit=0,debit=0;
        if(args.length!=2) System.out.println("pass only 2 argumets such as debit amount and credit amount");
        else{
           debit=Integer.parseInt(args[0]);
           credit=Integer.parseInt(args[1]);
        }
        LoanAccount obj1=new LoanAccount(credit,debit);
        obj1.doTransaction();
    }
    
}
