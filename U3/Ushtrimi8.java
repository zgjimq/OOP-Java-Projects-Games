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
public class Ushtrimi8 {
    public static void main (String[]args){
    String SENTINEL="END";
    Scanner sc = new Scanner(System.in);
        System.out.println("Shkruaj nje fjale");
        String fjala = sc.nextLine();
        int countALL=0;
        int countK=0;
        
        do {
            countALL++;
            if(!fjala.equals(SENTINEL)){
                if(fjala.startsWith("0") || fjala.startsWith("1") || fjala.startsWith("2") || fjala.startsWith("3")
            || fjala.startsWith("4") || fjala.startsWith("5") || fjala.startsWith("6")
            || fjala.startsWith("7") || fjala.startsWith("8") || fjala.startsWith("8") || fjala.startsWith("9") 
            && fjala.endsWith("0") || fjala.endsWith("1") || fjala.endsWith("2") || fjala.endsWith("3")
            || fjala.endsWith("4") || fjala.endsWith("5") || fjala.endsWith("6") || fjala.endsWith("7")
            || fjala.endsWith("8") || fjala.endsWith("9")){
                    
                    countK++;
                
            }
                else{
                }
             System.out.println("shtyp nje fjale");
                fjala=sc.nextLine();
            }
                
        }while(!fjala.equals(SENTINEL));
        System.out.println("Gjithsej fjali te shtypura jane :" +countALL + "\nDhe prej ketyre fjalive kushti eshte "
                + "plotesuar " +countK);
    }
}
