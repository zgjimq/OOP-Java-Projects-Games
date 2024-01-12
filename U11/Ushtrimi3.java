/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U11;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi3 {
    public static void main (String[]args){
    Scanner scan=new Scanner(System.in);
        System.out.println("Shtyp madhesin e vargut me te madh se 15");
        int madhesia =scan.nextInt();
        do{
        if(madhesia<15){
            System.out.println("Shtyp perseri");
            madhesia=scan.nextInt();
        }
        }while(madhesia<15);
        int []vargu=new int[madhesia];
        
        for(int i=0;i<vargu.length;i++){
            System.out.println("Shtyp numer ");
            vargu[i]=scan.nextInt();
        }
        
    }
  //  public static int[]findNumbers(int[]v){
   // int nrMeIMadh=0;
   // for(int i=0;i<v.length;i++){
    //if(v[i]>nrMeIMadh){
    //nrMeIMadh=v[i];
    //}
    //}
    int nrMeIMadh=0;
        
    //}
}
