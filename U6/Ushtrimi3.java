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
public class Ushtrimi3 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp numrin 10:");
        int nr =sc.nextInt();
        
        do{
            if(nr!=10){
            System.out.println("shtyp perseri :");
            nr=sc.nextInt();
        }
        }while(nr!=10);
        sc.nextLine();
        int countKushti=0;
        
        for(int i=0;i<nr;i++){
            System.out.println("Shtyp fjalen/fjaline");
            String line=sc.nextLine();
            if(finalWord(line)){
            countKushti++;
            }
        }
        System.out.println("Jane shtypur gjithsej :"+nr+" dhe kushti eshte plotesuar :"+countKushti);
    }
    public static boolean finalWord(String f){
    if(f.toUpperCase().startsWith("A")&& f.length()%3==0){
    return true;
    }else{
    return false;
    }
    }
}
