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
public class Program2 {
    public static void main(String a[]){
        int N;
        System.out.println("Enter Number :");
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }        
        
    }
    
}
