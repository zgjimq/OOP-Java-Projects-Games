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
public class Ushtrimi5 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtyp numer me te madh se 5");
        int nr=sc.nextInt();
        while(nr<5){
            System.out.println("shtyp numrin perseri");
            nr=sc.nextInt();
        }
        sc.nextLine();
        int countKushti=0;
        
        for(int i =0;i<nr;i++){
            System.out.println("shtyp fjal/fjalin:");
            String line=sc.nextLine();
            if(checkString(line)){
            countKushti++;
            }
        }
        System.out.println("Gjithsej jane shtypur fjali :"+nr+" dhe kushti eshte plotesuar :"+countKushti);
    }
    public static boolean checkString(String fjala){
        if(fjala.length()%2==0){
        return true;
        }else{
        return false;
        }
    }
}
