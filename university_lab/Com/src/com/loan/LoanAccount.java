/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan;
import com.transact.Transaction;
/**
 *
 * @author dharwin
 */
public class LoanAccount {
    public int amount=5000;
    int cdt,dbt;
    public LoanAccount(int credit,int debit){
        this.cdt=credit;
        this.dbt=debit;
    }
    public void doTransaction(){
        System.out.println("amount before transaction: "+amount);
        amount=Transaction.debit(amount,dbt);
        amount=Transaction.credit(amount,cdt);
        System.out.println("amount after transaction: "+amount);
    }
}
