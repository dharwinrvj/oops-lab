/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transact;
/**
 *
 * @author dharwin
 */
public class Transaction {
    public static int credit(int amount,int cdt){
        return (amount+cdt);
    }
    public static int debit(int amount,int dbt){
     return (amount-dbt);
    }    
}
