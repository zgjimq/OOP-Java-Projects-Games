/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi5 {
    public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
        System.out.println("shtyp nr se paku 7");
        int nr =sc.nextInt();
        do{
        if(nr<7){
            System.out.println("shtyp nje numer");
            nr=sc.nextInt();
        }
        }while(nr<7);
        sc.nextLine();
        String rreshti="";
        for(int i=0;i<nr;i++){
            System.out.println("shtyp nje fjale");
            String line=sc.nextLine();
            if(i==0){
            rreshti=line;
            }
        }
            System.out.println(rreshti);
    }
}
