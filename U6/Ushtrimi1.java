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
public class Ushtrimi1 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtypni numrin prej 4 ose 10");
        int nr = sc.nextInt();
        
        while(nr<4 || nr>10){
            System.out.println("Shtyp perseri nr mes 4 ose 10");
            nr = sc.nextInt();
        }
        int countKushti=0;
        
        for (int i=0;i<nr;i++){
            System.out.println("Shtyp numrin:");
            int numri=sc.nextInt();
            if(pozitivInterval(numri)){
            countKushti++;
            }
        }
        System.out.println("Gjithsej jane shtypur :"+nr+" kushtin e plotesojne :"+countKushti);
    }
    public static boolean pozitivInterval(int nr){
    if(nr>0&& (nr>10&&nr<20)){
    return true;
    }else{
    return false;
    }
    }
}
