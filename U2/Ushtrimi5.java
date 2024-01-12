/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi5 {
    public static void main (String[]args){
    Scanner scan = new Scanner (System.in);
    String sentinel = "END";
        System.out.println("Shtyp nje fjali :");
        String fjala = scan.nextLine ();
        int countAll=0;
        int countK=0;
        while (!fjala.equals(sentinel)){
        countAll++;
        if (fjala.endsWith("B") || fjala.endsWith("E") || fjala.startsWith("A") || fjala.startsWith("D")){
        countK++;
        }
            System.out.println("Shtyp fjalin :");
            fjala = scan.nextLine();
            
        }
        System.out.println("Gjithsej fjali jane shkruar :" + countAll + "\nDhe kan plotesuar kushtin :" +countK);
        
    }
    
}
