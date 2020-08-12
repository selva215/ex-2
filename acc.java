/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise2;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class acc {
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        account a=new account("19cse072","harshini",0);
        System.out.println("ID:"+a.getid());
        System.out.println("name:"+a.getname());
        System.out.println("balance:"+a.getbalance());
        System.out.println("enter amount to be credited:");
        int cre=obj.nextInt();
        System.out.println("balance:"+a.credit(cre));
        System.out.println("enter amount to be debited:");
        int deb=obj.nextInt();
        System.out.println("balance:"+a.debit(deb));
        account a1=new account("19cse081","paarkavi",1000);
        System.out.println("ID:"+a1.getid());
        System.out.println("name:"+a1.getname());
        System.out.println("balance:"+a1.getbalance());
        System.out.println("enter amount to be transfered:");
        int tra=obj.nextInt();
        System.out.println("balance:"+a.transfer(a1,tra)); 
        System.out.println(a.toString());
        System.out.println(a1.toString());
        
    }
    
}
class account
{
    String id;
    String name;
    int bal=0;
    account(String i,String n,int b)
    {
        id=i;
        name=n;
        bal=b;
    }
    account(String i,String n)
    {
        id=i;
        name=n;
    }
    String getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getbalance()
    {
        return bal;        
    }
    int credit(int amo)
    {
        bal=bal+amo;
        return bal;
    }
    int debit(int amo)
    {
        if(amo<=bal)
            bal=bal-amo;
        else
            System.out.println("amount exceeded balance");
        return bal;        
    }
    int transfer(account a1,int amount)
    {
        if(amount<=bal)
        {
            bal=bal-amount;
            a1.bal=a1.bal+amount;
        }
        else
            System.out.println("amount exceeded balance");
        return bal;
    }
    public String toString()
    {
        return "ID:"+id+"\nname:"+name+"\nbalance:"+bal;
    }
    
}