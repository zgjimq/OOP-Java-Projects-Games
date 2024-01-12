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
public class Ushtrimi4 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtyp se paku nje numer 7");
        int nr=sc.nextInt();
        
        while(nr<7){
            System.out.println("Shtyp nje numer");
            nr=sc.nextInt();
        }
        sc.nextLine();
        int count=0;
        int countKDh=0;
        int countKtre=0;
        for(int i = 0;i<nr;i++){
            System.out.println("shtyp nje numer me presje dhjetore");
            double nrD=sc.nextDouble();
            count++;
            if(nrD>9 && nrD<100){
            countKDh++;
            }
            if(nrD>99 && nr<1000){
            countKtre++;
            }
            }
            
            if(countKDh>0 && countKtre>0){
             System.out.println("Jane shtypur gjithsej :"+count+"\nNumra dyshifror :"+countKDh+"\nDhe treshifror ishin :"
                        + countKtre);
            }
            if(countKtre==0){
            System.out.println("Nuk eshte shtypur as nje numer treshifror");
            }
            if(countKDh==0){
                System.out.println("Nuk eshte shtypur asnje numer dyfishor");
        }
    }
}
