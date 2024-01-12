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
public class BeetweenNm {
     public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number:");
        int ss = s.nextInt();
        while (ss < 1 || ss > 10){
             System.out.println(ss+ " nuk eshte ndermjet 1 -10 ");
             ss = s.nextInt();
        }
             System.out.println(ss+" eshte ndermjet 1-10");
    }      
}
        
