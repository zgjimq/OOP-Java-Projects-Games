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
public class Ushtrimi4 {
    public static void main (String[]args){
        int SENTINEL = -5555;
        int countA = 0;
        int cift=0;
       System.out.println("Numri SENTINEL eshte -5555");
        System.out.println("Shtyp nje numer");
       Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        while (nr !=SENTINEL){
        if (nr == 0){
        countA++;
        }
        else if (nr %2==0 && nr>99 && nr <999){
        cift++;
        }
         System.out.println("shtypni nje numer :");
            nr = sc.nextInt();
            countA++;
        }
        if (countA==0){
            System.out.println("Nuk eshte shtypur as nje ");
        }
        else {
            System.out.println("jane shtypur gjithsej " + countA + " numra dhe " + cift + " prej tyre plotesojn kushtin");
              
    }
    }
    
}
