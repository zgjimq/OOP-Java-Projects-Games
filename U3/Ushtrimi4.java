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
public class Ushtrimi4 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int SENTINEL = -9999;
    int countALL=0;
    int nrMeIMadh=0;
        System.out.println("shtyp numrin :");
        int nr = sc.nextInt();
        
        do {
            if (nr!=SENTINEL){
                countALL++;
                if (nr >nrMeIMadh){
                nrMeIMadh=nr;
                }
                System.out.println("shtyp nje numer ");
                nr = sc.nextInt();
            
            }else{
            break;
            }
        
        }while (nr!=SENTINEL);
        System.out.println("Gjithsej jane shtypur:" + countALL + " \nDhe nr me i madh eshte :" +nrMeIMadh);
    }
    
}
