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
public class Ushtrimi6 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Shtypni nje fjali dhe fjala SENTINEL eshte \"EXIT\"");
        String SENTINEL = "EXIT";
        String fjala = sc.nextLine();
        int count = 0;
        String cse1 = "CSE";
        while (!fjala.equals(SENTINEL)){
        if (fjala.contains(cse1)){
        count++;
        }
            System.out.println("Shtypni nje fjali");
            fjala = sc.nextLine();
        }
        System.out.println("Ju keni permbushur kushtin :" + count);
    } 
}
