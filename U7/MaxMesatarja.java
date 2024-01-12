/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U7;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class MaxMesatarja {
    public static void main (String[]args){
    Scanner scan=new Scanner(System.in);
        System.out.println("Shtyp numer :");
        int nr=scan.nextInt();
        while(nr<15){
            System.out.println("Shtyp perseri numer");
            nr=scan.nextInt();
        }
        scan.nextLine();
        int [] vargu=new int[nr];
        
        for(int i=0;i<vargu.length;i++){
            System.out.println("Shtyp numer per plotesimin e vargut");
            vargu[i]=scan.nextInt();
        }
        int rezultati = maxMesatarja(vargu);
        System.out.println("Jane shtypur gjithsej "+nr+" numra dhe "+rezultati+" ishte numri me i madh me i madh"
                + " se mesatarja");
    }
    public static int maxMesatarja(int []v){
        int sum=0;
        int count=0;
        int numriMadh=0;

        for(int i=0;i<v.length;i++){
            sum+=v[i];
            count++;
        }
        int avg=sum/count; //3.33

        for(int i=0;i<v.length;i++){
            if(v[i]>avg){ //10
                numriMadh=v[i]; //10
            }
        }
        return numriMadh;
    }
}
