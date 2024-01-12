/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U3;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi3 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int SENTINEL = -9999;
    int countALL=0;
    int countK=0;
        System.out.println("shtyp nje numra");
        int numrat=sc.nextInt();
        
        do {
            if (numrat!=SENTINEL){
                countALL++;
                if (numrat>10 && numrat <20 || numrat >45 && numrat<55){
                    countK++;
                
                }
                System.out.println("shtyp numer");
                numrat = sc.nextInt();
            
            }
            else {
            break;
            }
        
        }while (numrat!=SENTINEL);
        System.out.println("gjithsej jane shtypur " + countALL + " dhe kane plotesuar kushtin " +countK);
    
    }
    
}
