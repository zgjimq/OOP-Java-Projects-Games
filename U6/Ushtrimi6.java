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
public class Ushtrimi6 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtyp numrin :");
        int nr=sc.nextInt();
        do{
            if(nr<9){
                System.out.println("Shtyp numerin perseri");
                nr=sc.nextInt();
            }
        }while(nr<9);
        sc.nextLine();
        int countKushti=0;
        
        for(int i=0;i<nr;i++){
            System.out.println("shtypni fjalen/fjaline");
            String line=sc.nextLine();
            if(checkStringType(line)){
            countKushti++;
            }
        }
        System.out.println("Jane shtypur gjithsej :"+nr+" fjale-fjali dhe "+countKushti+" prej tyre plotesojne kushtin.");
    }
    public static boolean checkStringType(String fjala){
    if(fjala.endsWith("?")||fjala.endsWith("!")){
    return true;
    }
    else{
    return false;
    }
    }
}
