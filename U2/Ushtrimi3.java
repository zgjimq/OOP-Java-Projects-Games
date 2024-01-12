/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi3 {
    public static void main (String[]args){
        System.out.println("numri SENTINEL eshte -9999");
        Scanner sc=new Scanner(System.in);
        int SENTINEL=-9999;
        int countA=0;
        int countK=0;
        System.out.println("shtyp numrin :");
        int nr = sc.nextInt();
        
        while (nr != SENTINEL){
        countA++;
        if (nr %2 == 0 && nr %4!=0){
        countK++;
        }
         System.out.println("shtyp numrin :");
         nr = sc.nextInt();
        }
       System.out.println("Gjithsje jane shtypur " +countA+ "\nKushtet e plotesojn " +countK +" numra");
    }   
}
