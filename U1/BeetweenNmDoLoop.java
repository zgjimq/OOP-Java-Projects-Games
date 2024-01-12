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
public class BeetweenNmDoLoop {
    public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    int s1;
    do {
    System.out.println("enter a number between 1 - 10");
     s1 = s.nextInt();
    
    }while (s1 < 1 || s1 > 10);
     System.out.println("Congrats " + s1 + " is the right number!");
  }
}
