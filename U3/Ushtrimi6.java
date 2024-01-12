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
public class Ushtrimi6 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String SENTINEL = "END";
    int countALL = 0;
    int countK=0;
        System.out.println("shkruaj nje fjali");
        String fjala = sc.nextLine();
    
    do {
        if (!fjala.equals(SENTINEL)){
            countALL++;
            if (fjala.charAt(fjala.length()-2)=='B' && fjala.length()%2==0){
            countK++;
            }
            System.out.println("shtyp nje fjale");
            fjala=sc.nextLine();
        
        }else{
        break;
        }
    
    }while (!fjala.equals(SENTINEL));
        System.out.println("Gjithsej jane shtypur " + countALL + " kushti u permbush " + countK);
    }
}
