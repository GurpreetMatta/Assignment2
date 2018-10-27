/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Gurpreet Singh
 */
public class Program6 {
    public static void main(String args[])
    {
        int a[]={1,1,1,1,0,0,1,0};
       
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<a.length;i++)
                System.out.println("array element" +i+"is"+a[i]);
    }
}
