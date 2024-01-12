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
public class Ushtrimi4 {
  public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
      System.out.println("Shtyp numer me te madh se 8:");
      int nr=sc.nextInt();
      
      while(nr<8){
          System.out.println("Shtyp numerin perseri:");
          nr=sc.nextInt();
      }
      double minNr=0;
      int count=0;
      for(int i=0;i<nr;i++){
          System.out.println("Shtyp numer:");
          double numri=sc.nextDouble();
          if(minNr==0){
          minNr=numri;
          }
          else if(numri%2==0 && numri>0){
          count++;
         if(numri<minNr){
         minNr=numri;
         } 
          }
          
      }
      
      if(count==0){
          System.out.println("Nuk eshte shtypur asnje numër çift pozitivë");
      }else{
          System.out.println("jane shtypur gjithsej :"+nr+" numra dhe "+minNr+" ishte numri me i vogel pozitiv");
      }
  }
}
