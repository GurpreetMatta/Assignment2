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
public class Program4 {
    
    public static void main(String a[])
    {
        int num,rem,sum=0;
         System.out.println("Enter Number:");
        Scanner s= new Scanner(System.in);
        num=s.nextInt();
        int numcpy=num;
        while(numcpy!=0)
        {
            rem=numcpy%10;
            sum=sum+rem*rem*rem;
            numcpy=numcpy/10;
            
        }
        if(num==sum)
        {
            System.out.println("Armstrong number");
          
        }
        else
        {
            System.out.println("not armstrong number");
        }
             
    }
    
}
