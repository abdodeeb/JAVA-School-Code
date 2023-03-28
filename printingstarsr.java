/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printingstars;

/**
 *
 * @author abduldeeb
 */
public class printingstarsr {
   
public static void main(String []args)
{
    System.out.println("Q1");
    for(int i=0; i<10; i++)
    {
        for(int j=0; j<i; j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
    System.out.println("Q2");
    int NoSpace = 10-1;
    for(int i=0; i<10; i++)
    {
       for(int space=0; space<NoSpace; space++) 
        {
               System.out.print(" ");
           }
             for(int star=0; star<i; star++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        NoSpace--;
    }
    
    System.out.println("Q3");
    int numberofline = 7;
    int numberofspace = (numberofline/2)+1;
    int numberofstar = 1;
    for(int i=1; i<=numberofline+1; i++)
    {

            for(int j=1; j<=numberofspace; j++)
            {
                System.out.print(" ");
            }
            
            for(int j=0; j<numberofstar; j++)
            {
                System.out.print("*");
            }
            numberofspace--;
            numberofstar +=2;
            System.out.print("\n");
    }
    

    System.out.println("Q4");
     numberofline = 7;
     numberofspace = (numberofline/2+1);
     numberofstar = 1;
    for(int i=1; i<=numberofline+1; i++)
    {
            for(int j=1; j<=numberofspace; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<numberofstar; j++)
            {
                System.out.print("*");
            }
            numberofstar +=2;
            System.out.print("\n");
    }
    if(j <= (numberofline/2+1))
    {
        for(int j=1; j<=numberofspace; j++)
        {
            System.out.print("");
        }
        for(int j=0; j<numberofstar; j++)
        {
            System.out.print("*");
        }
        numberofstar +=2;
                System.out.print("\n");
        }
    }
}
            




    
    
            
            
      


   
