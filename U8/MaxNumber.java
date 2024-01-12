/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U8;

/**
 *
 * @author Bruger
 */
import java.util.Scanner;
public class MaxNumber {
    public static void main (String[]args){
    Scanner scan=new Scanner (System.in);
        System.out.println("Shtyp madhesine e vargut se paku 15");
        int madhesia =scan.nextInt();
        //e validon variablen madhesia me pas vleren +15!!
        while(madhesia<15){
            System.out.println("Shtyp perseri madhesine e vargut se paku 15");
            madhesia=scan.nextInt();
        }
        //e kana deklaru edhe inicializu vargun 
        int []vargu=new int[madhesia];
        //i kemi insertu elementet brenda vargut 
        //kur eshte nje metod statice ? ne test kur vendoset statice , 
        for(int i=0;i<vargu.length;i++){
            System.out.println("Shtyp nje numer");
            vargu[i]=scan.nextInt();
            // int nr =scan.nextInt();
            //vargu[]=nr;
        }
        int rezultati=firstMax(vargu);
        System.out.println("Jane shtypur gjithsej "+vargu.length+" numra dhe "+rezultati+" ushte numeri i pare me "
                + "i madh");
    }
    public static int firstMax(int[]v){
    int shuma =0;
    for(int i=0;i<v.length;i++){
    shuma +=v[i];
    }
    // mesataren
    double mesatarja =(double) shuma/(double)v.length;
    
    for(int i=0;i<v.length;i++){
    if(v[i]>mesatarja){
    return v[i];
    }
    }
    return 0;
    }
}
