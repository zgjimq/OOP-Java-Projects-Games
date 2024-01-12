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
public class Ushtrimi1 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int SENTINEL = -9999;
    int countA=0; // per me numberu sa numra
    int countKushti=0; // per me i numeru sa e plotesojn kushtin
        System.out.println("Shtyp numerin:");
        int nr = sc.nextInt();
     while (nr!=SENTINEL){
     countA++;
     if(nr >=25 && nr <=30){
     countKushti++;
     }
         System.out.println("Shtyp numrin ");
         nr = sc.nextInt();
     }   
     if (countA ==0){
         System.out.println("nuk eshte shtypur as nje numer");
         
     }   
     else{
          System.out.println("Gjithsej jane: " + countA + " dhe gjithsej kan plotesuar kushtin : " + countKushti);

     }
        

    }
    
}
