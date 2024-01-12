/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U1;
import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class BreakAndContinue {
    public static void main (String[]args){
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("enter number from 1-10");
            int n = s.nextInt();
            if(n<1 || n>10)
                continue;
            System.out.println(n+ " is the right number");
            break;
        }
        for (int i = 1;i<=10;i++){
        if(i%2==0)
            continue;
        System.out.println(i +" ");
        }
    }
 }

