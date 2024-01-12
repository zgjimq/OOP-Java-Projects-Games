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
public class Ushtrimi1 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtyp se paku 5 per madhesin e vargut");
        int madhesia=sc.nextInt();
        while(madhesia<5){
            System.out.println("Shtyp perseri");
            madhesia=sc.nextInt();
        }
        int [] vargu = new int[madhesia];
        for(int i = 0 ;i<vargu.length;i++){
            System.out.println("Shtyp nje numer");
            vargu[i]=sc.nextInt();
        }
        int totali = totalNumbers(vargu);
        double mesatarja=averageNumbers(vargu);
        System.out.println("Jane shtypur gjithsej " + madhesia+" numra, shuma e numrave te shtypur ishte "+ totali
        +", ndersa mesatarja ishte "+mesatarja);
    }
    public static int totalNumbers(int[]v){
    int shuma = 0;
    for(int i =0;i<v.length;i++){
    shuma +=v[i];
    }
    return shuma;
    }
    public static double averageNumbers(int []v){
    //int shuma =0;
   // for(int i =0;i<v.length;i++){
   // shuma +=v[i];
   // }
   int shuma=totalNumbers(v);
    double mesatarja=(double)shuma /(double)v.length;
    return mesatarja;
    }
}
   
