/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U6;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi2 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtyp numer se paku 6");
        int nr=sc.nextInt();
        
        do{
        if(nr<6){
            System.out.println("Shtyp perseri:");
            nr=sc.nextInt();
        }
        }while(nr<6);
        sc.nextLine();
        String fjalaEdyte=" ";
        String fjalaEkater=" ";
        
        for(int i = 0;i<nr;i++){
            System.out.println("shtyp fjaline");
            String line=sc.nextLine();
            if(i==1){
            fjalaEdyte=line;
            }
            if(i==3){
            fjalaEkater=line;
            }
            
        }
        String fMeGjate=krahasoFjalite(fjalaEdyte , fjalaEkater);
            System.out.println("fjalia me e gjate eshte :"+fMeGjate);
        
    }
    public static String krahasoFjalite(String f1 , String f2){
    if (f1.length()>f2.length()){
    return f1;
    }else{
    return f2;
    }
    }
}
