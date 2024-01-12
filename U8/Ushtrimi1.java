/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U8;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi1 {
    public static void main (String[]args){
    Scanner scan=new Scanner(System.in);
        System.out.println("Shtyp se paku 5 per plotesimin e vargut");
        int madhesia=scan.nextInt();
        while(madhesia<5){
            System.out.println("Shtyp perseri numer me te madhe se 5");
            madhesia=scan.nextInt();
        }
        int []vargu=new int [madhesia];
        for(int i=0;i<vargu.length;i++){
            System.out.println("Shtyp numer per plotesimin e vargut");
            vargu[i]=scan.nextInt();
        }
        double rez =calculateNumbers(vargu);
        System.out.println("total numra "+vargu.length);
        System.out.println("Perqindja e numrave tek eshte" + calculateNumbers(vargu)+"%");
    }
    public static double calculateNumbers(int[]v){
    double shuma=0;
    for(int i=0;i<v.length;i++){
    if(v[i]%2!=0){
    shuma++;
    }
    }
    double perqindja = shuma/v.length*100;
    return perqindja;
    }
}
