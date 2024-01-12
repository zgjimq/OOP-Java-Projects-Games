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
public class Ushtrimi1 {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    int nr; // na tregon sa numra kena me i shtype
    int countK =0;
    System.out.println("Shkruani nje numer tek me te madh se 3");
        nr=sc.nextInt();
    do {
        if(nr%2==0 || nr<3){
        System.out.println("Shkruani nje numer tek me te madh se 3");
        nr=sc.nextInt();
        }
    }while(nr%2==0 || nr<3);
    
    for(int i =0;i<nr;i++){
        System.out.println("Shtyp nr ");
        int numri = sc.nextInt();
        if(numri%4==0){
        countK++;
        }
    }
        double p=((double)countK/(double)nr)*100;
        System.out.println("Gjithsej jane shtypur "+nr+" numra dhe perqindja e tyre eshte "+p +"e plotpjestushem me 4");
    }
}