/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi2 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Shtypni numrin me te madh se 5");
        int nr =sc.nextInt();//sa fjal fjali do te shtypen 
        while(nr<5){
            System.out.println("Shtyp numrin perseri me te madh se 5");
            nr=sc.nextInt();
        }
        String max =" ";
        sc.nextLine();// me shpraz skanerin me vazhdu me string...
        for(int i =0;i<nr;i++){
            System.out.println("Shtyp fjal/fjali");
            String line = sc.nextLine();
            if(line.length()>max.length()){
            max=line;
            }
            System.out.println("Fjalia me e gjate eshte "+max);
        }
    }
}
