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
public class Ushtrimi2 {
    /* Write a program which reads a sequence of integers from
    the user and stops by displaying "Done" whene the sum of these
    values exceeds 100.
    */
    public static void main (String[]args){
    Scanner i = new Scanner (System.in);
    int i1=0;
    while(true){
        System.out.println("Enter a number");
        i1=i.nextInt();
        if(i1>100)
            break;
    }
        System.out.println("\"Done\"" + i1);
    }
}
