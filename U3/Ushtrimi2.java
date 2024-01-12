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
public class Ushtrimi2 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int SENTINEL = -9999;
    int countALL = 0;
    int countKushti=0;
    System.out.println("Shtyp numrin");
    int nr = sc.nextInt();
    
    do {
        if (nr!=SENTINEL){
            countALL++;
            if(nr%2!=0 && nr < 10){
                countKushti++;
            }
            System.out.println("Shtyp numrin");
            nr = sc.nextInt();
        }
        else {
        break;
        }
    }while (nr!=SENTINEL);
    
        System.out.println("Gjithsej keni shtypur " + countALL + " dhe kane plotesuar kushtin " + countKushti);
    }
    
}
