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
public class NumeroSimbolet {
    public static void main (String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Shtyp numer:");
    int nr=scan.nextInt();
        do{
            if(nr<10){
            System.out.println("Shtyp numer");
            nr=scan.nextInt();
            }
        }while(nr<10);
        scan.nextLine();
        String [] vargu=new String[nr];
        for(int i=0;i<vargu.length;i++){
            System.out.println("Shtyp fjalin :");
            vargu[i]=scan.nextLine();
        }
        int rezultati=numerSimbolet(vargu);
        System.out.println("Jane shtypur gjithsej "+nr+" fjale/fjali "+rezultati+" prej tyre ploteson kushtin");
    }
    public static int numerSimbolet(String[]v){
    int shuma=0;
    for(int i=0;i<v.length;i++){
    if(!(v[i].contains("+")||v[i].contains("-")||v[i].contains("*")||v[i].contains("/")||v[i].contains("%"))&& v[i].length()>6 && v[i].length()<15){
    shuma++;
    }
    }
    return shuma;
    }
}
