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
public class Ushtrimi5 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String SENTINEL = "END";
        System.out.println("Shtyp nje fjali");
        String fjala = sc.nextLine();
        int countALL=0;
        int countK=0;
        
        do {
            if(!fjala.equals(SENTINEL)){
            countALL++;
            if(fjala.startsWith("F") && fjala.length()>5){ //if (fjala.chatAt(0)=='F'&&fjalia.length()>5){}
                countK++;
            }
                System.out.println("shtyp nje fjali ");
                fjala=sc.nextLine();
                
            }
            else {
            break;
            }
        
        }while(!fjala.equals(SENTINEL));
        if(countK==0){
            System.out.println("asnje nuk e ploteson kushtin");
            
        }
        else {
            System.out.println("gjithsej fjali jane shtypur: " + countALL + "\nDhe kushtin e plotesojn: " + countK);
        }
    }
    
}
// char s1 = d.charAt(0);  shkronjen e pare
//char s2 = d.charAt(d.length()-1); shkronjen e fundit.
// if (fjala.chatAt(0)=='F'&&fjalia.length()>5){}