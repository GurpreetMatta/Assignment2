/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Gurpreet Singh
 */
public class Program5 {
    public static void main(String a[]){
    int num,rev=0;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter number:");
   num=s.nextInt();
   int i,rem;
   
   while(num!=0)
   {
       rem=num%10;   
       rev=rev*10+rem;
       num=num/10;  
       
   }
     
       System.out.println("Reverse ="+rev);
     
    }
    
}
