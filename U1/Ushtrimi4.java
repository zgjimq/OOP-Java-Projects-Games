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
/* write a program whitch displays the sum of the strict 
divisors of an integer given by the user.
the strict divisors of a number N are    <=n/2
if n%i == 0 ,then i is a divisor of N
*/
public class Ushtrimi4 {
    public static void main (String[]args){
    Scanner s= new Scanner(System.in);
        System.out.println("Enter ur number");
        int n = s.nextInt();
        int sum = 0;
        for (int i =1; i <=n/2;i++)
            if (n%i==0)
               // sum +=i;
        System.out.print(i +  " ");
                
     //   System.out.println(sum);
    }
    
}
