/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U1;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi3B {
     /* Write a program which reads a positive number N 
    from the user then indicates if N is a prime number or not
    */
    // the strict divisors of a number N are    <=n/2
    
    public static void main (String[]args){
    Scanner m = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = m.nextInt();
        boolean prime = true;
        for (int i =2 ; i <= n/2;i++)
            if(n%i==0){
                prime = false;
                break;
               }
        System.out.println(prime ? "prime" : "not prime");
        
    }
    
}
