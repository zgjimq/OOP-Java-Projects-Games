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
public class Ushtrimi6 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("shtyp nje numer se paku 17");
        int nr=sc.nextInt();
        while(nr>17){
            System.out.println("SHTYP NJE NUMER");
            nr=sc.nextInt();
        }
        sc.nextLine();
        int count =0;
        int countK=0;
        for(int i=0;i<nr;i++){
            System.out.println("shtyp nje fjale");
            String line=sc.nextLine();
           // if(line.()|| line.toLowerCase().contains("ubt")){ //char at
           if(line.charAt(0)>=0 || line.charAt(0)<=9 && line.toLowerCase().endsWith("cse")){
           countK++;
           }   
        }
            System.out.println("Jane shtypur gjithsej "+nr +" fjale/fjali dhe "+ countK+" plotesojne kushtin");
    }
}
