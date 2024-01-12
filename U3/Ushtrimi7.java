/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U3;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class Ushtrimi7 {
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
        System.out.println("shtyp nje fjali");
        String fjala = sc.nextLine();
        String SENTINEL = "EXIT";
        int countALL = 0;
        int countK=0;
        
        do {
            countALL++;
            if(!fjala.equals(SENTINEL)){
            if(fjala.endsWith("a") || fjala.endsWith("e") || fjala.endsWith("ë") || fjala.endsWith("i") || fjala.endsWith("o")
                    || fjala.endsWith("u") || fjala.endsWith("p")){
            countK++;
            }
                System.out.println("Shtyp nje fjale :");
                fjala=sc.nextLine();
            }
            else{
            break;
            }
         
        }while (!fjala.equals(SENTINEL));
        System.out.println("Fjale te shtypura jane :" + countALL + "\nDhe kushti u plotesuar :"+countK);
    }
}
