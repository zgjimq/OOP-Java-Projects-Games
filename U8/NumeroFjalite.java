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
public class NumeroFjalite {
   public static void main (String[]args){
    Scanner scan=new Scanner(System.in);
       System.out.println("Shtyp madhesine e vargut se paku 10");
       int madhesia=scan.nextInt();
       do{
           if(madhesia<10){
               System.out.println("Shtyp perseri numer se paku 10");
               madhesia=scan.nextInt();
           }
       }while(madhesia<10);
       
       scan.nextLine();
       String [] vargu=new String[madhesia];
       
       for(int i =0;i<vargu.length;i++){
           System.out.println("Shtyp fjal/fjali");
           vargu[i]=scan.nextLine();
       }
       int rezultatin = numeroFjalen(vargu);
       System.out.println("Jane shtypur gjithsej "+vargu.length+" fjale fjali "+rezultatin+" prej tyre plotesojn kushtin");
   } 
   public static int numeroFjalen(String[]v){
   int count=0;
   
   for(int i=0;i<v.length;i++){
   String f=v[i].toLowerCase();
   if(!f.contains("a")&&!f.contains("e")&&!f.contains("i")&&!f.contains("0")&&!f.contains("u")&&!f.contains("y")
           &&f.length()>4 && f.length()<8){
   count++;
        }
   }
   return count;
   }
}
