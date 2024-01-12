/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U7;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class AvgComputer {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Shtyp se paku 10");
        int madhesia=sc.nextInt();
        while(madhesia<10){
            System.out.println("Shtyp perseri");
            madhesia=sc.nextInt();
        }
        String [] vargu=new String[madhesia];
        sc.nextLine();
        for(int i =0;i<vargu.length;i++){
            System.out.println("Shtyp fjalen/fjalin");
            vargu[i]=sc.nextLine();
        }
        double rezultati=computerAvg(vargu);
        System.out.println("Jane shtypur gjithsej "+madhesia+" fjale/fjali dhe gjatesia dhe gjatesia mesatare e atyre"
                + " qe permban fjalen\n computer eshte "+rezultati);
    }
    public static double computerAvg (String[]v){
    int shuma=0;
    int count=0;
    for(int i=0;i<v.length;i++){
    if(v[i].toLowerCase().contains("computer")){
    shuma +=v[i].length();
    count++;
    }
   }
    double mesatarja=(double)shuma / (double)count;
    return mesatarja;
    }
}
    
    
