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
public class Program7 {
    public static void main(String args[])
    {
        int a[]={1,4,6,7,8,9,10};
        int num;
        System.out.println("Enter Number:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i=0;i<a.length;i++)
        {   
            if(a[i]==num)
            {
               System.out.println("found at position"+(i+1));
            }
        }
        
        
    }
    
}
