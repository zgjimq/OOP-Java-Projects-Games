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
public class Ushtrimi7 {
    public static void main (String[]args){
        String fjala = "SHKI";
        System.out.println("Fjala END eshte SENTINEL");
        String SENTINEL = "END";
        int countK = 0 ;
        int countA=0;
        Scanner sc = new Scanner(System.in);
        String fjala2=sc.nextLine();
        
        while (!fjala2.equals(SENTINEL)){
            //System.out.println(fjala2.compareTo(fjala));
            countA++;
            if (fjala2.compareTo(fjala)>0){
            countK++;
            }
            
            System.out.println("shtypni nje fjali");
            fjala2=sc.nextLine();
   
        }
        if (countA == 0){
            System.out.println("Nuk keni shtypur as nje fjal");
        }
         else {
            System.out.println("Ju keni shtypur "+countA + " dhe " + countK + " kane plotesuar kushtin");
        }
    }
}
