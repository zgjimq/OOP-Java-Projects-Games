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
public class Ushtrimi3 {
    /* Write a program which reads a positive number N 
    from the user then indicates if N is a prime number or not
    */
        // the strict divisors of a number N are  <=n/2
        // if N%i = 0 , then i is a divisor of N

  public static void main (String[]args){
  Scanner N = new Scanner(System.in);
      System.out.println("Write a number :");
      int n = N.nextInt();
      int sum = 1 ;
      for (int i = 2; i<= n/2;i++)
          if(n%i==0)
          sum +=i;
      System.out.println(sum == 1 ? "prime number" : "not a prime number");
  }  
}
