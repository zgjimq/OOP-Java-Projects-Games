
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
public class Ushtrimi2 {
    public static void main (String[]args){
       int SENTINEL = -9999;
       int cift =0;
       int zero = 0;
       int tek=0;
        System.out.println("shtyp nje numer :");
        Scanner sc = new Scanner (System.in);
        int nr = sc.nextInt();
        
        while (nr !=SENTINEL ){
        if(nr==0){
        zero++;
        }
        else if (nr %2==0){
        cift++;
        }
        else if (nr !=0){
        tek++;
        }
       System.out.println("Shtyp nje numer :");
            nr = sc.nextInt();  
        }
        System.out.println("Numra zero jane :" + zero + "\nNumra cift jane :" + cift + "\nNumrat tek jane :" + tek);
    } 
    
}
