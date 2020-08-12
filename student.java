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
public class student {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String a;
        stud obj1[]=new stud[10];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter student name:");
            a=obj.next(); 
            System.out.println("enter roll number:");
            int n=obj.nextInt();
            obj1[i]=new stud(a,n);
            obj1[i].getdata();
            obj1[i].total();
            obj1[i].display();
            
        }
        
    }   
    
}
class stud
{
    String name;
    int m1,m2,m3,m4,m5;
    int avg,tot,roll;
    stud(String a,int n)
    {
        name=a;
        roll=n;
        
    }
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter maths mark");
        m1=obj.nextInt();
        System.out.println("enter java mark");
        m2=obj.nextInt();
        System.out.println("enter c mark");
        m3=obj.nextInt();
        System.out.println("enter dpsd mark");
        m4=obj.nextInt();
        System.out.println("enter ce mark");
        m5=obj.nextInt();
        
    }

   
    void total()
    {
        tot=m1+m2+m3+m4+m5;
        avg=tot/5;
    }
    void display()
    {
        System.out.println("student name:"+name);
        System.out.println("roll number:"+roll);
        System.out.println("maths mark:"+m1);
        System.out.println("java mark:"+m2);        
        System.out.println("c mark:"+m3);
        System.out.println("dpsd mark:"+m4);        
        System.out.println("ce mark:"+m5);
        System.out.println("total:"+tot);
        System.out.println("average:"+avg);
    }
}
        
