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
public class ShortCount {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtyp se paku 15 per madhesin e vargut");
        int madhesia=sc.nextInt();
        do{
            if(madhesia<15){
                System.out.println("Shtyp perseri");
                madhesia=sc.nextInt();
            }
         }while(madhesia<15);
        short [] vargu =new short[madhesia];
        for(int i =0;i<vargu.length;i++){
            System.out.println("Shtyp numrin per mbushjen e vargut :");
            vargu[i]=sc.nextShort();
        }
        double rez = countShorts(vargu);
        System.out.println("gjithsej"+madhesia+" metoda "+rez);
    }
    public static double countShorts(short[]v){
    int shuma=0;
    for(int i =0;i<v.length;i++){
    shuma +=v[i]; // mesatarja e te gjitha numrave
    }
    double mesatarja = (double)shuma / (double)v.length;
    int countkushti =0; // e gjejme perqindjen e numrave ne te vogel se mesatarja
    for(int i =0;i<v.length;i++){// e te gjith numrave me te vogel
    if(v[i]<mesatarja){
    countkushti++;
    }
    }
    double perqindja=(double)countkushti/(double)v.length *100;
    return perqindja;
    }
}
