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
public class Ushtrimi1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int SENTINEL =-9999;
        System.out.println("shtypni nje numer");
        int nr = sc.nextInt();
        int nrTek=0;
        int nrCift=0;
        int zero =0;
        
        do {
            if (nr !=SENTINEL){
                if (nr==0){
                    zero++;
                }
                else if(nr%2==0){
                    nrCift++;
                 
                }
                else if (nr%2!=0) {
                    nrTek++;
                }
                System.out.println("shtyp nje numer");
                nr = sc.nextInt();
            }else{
            break;
            }
            
        
        }while (nr!=SENTINEL);
        System.out.println("Numra zero ishin: " + zero + "\nNumra cift ishin: " + nrCift + "\nNumra tek ishin: " + nrTek);
        
        
    }
    
}
