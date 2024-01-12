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
public class Ushtrimi3 {
    public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
        System.out.println("Shtyp nje numer se paku me 10:");
        int nr=sc.nextInt();
        int count=0;
        while(nr<10){
            System.out.println("Shtyp nje numer");
            nr=sc.nextInt();
        }
        sc.nextLine();
        int countK=0;
        
        for(int i =0;i<nr;i++){
            System.out.println("Shtyp fjali");
            String fj=sc.nextLine();
            count++;
            if(fj.endsWith("Fund")&&fj.toUpperCase().contains("CSE")){
            countK++;
            }
        }
        System.out.println("fjale/fjali te shtypura jane :"+count +"\nDhe kushti eshte plotesuar :"+countK);
    }
}
