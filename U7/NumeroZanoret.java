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
public class NumeroZanoret {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Shtyp numer:");
        int nrInput=scan.nextInt();
        while(nrInput>10){
            System.out.println("Shtyp perseri");
            nrInput=scan.nextInt();
        }
        scan.nextLine();
        String[]array=new String[nrInput];
        
        for(int i=0;i<array.length;i++){
            System.out.println("Mbushe vargun");
            array[i]=scan.nextLine();
        }
        int rez=numeroZanoret(array);
        System.out.println("Gjithsej kemi "+array.length+" kushtin e ploteson "+rez);
}
 public static int numeroZanoret(String[]v){
     int count=0;
     for(int i = 0 ;i<v.length;i++){
     String txt=v[i]; // AAAaaa
     int countZanore=0;
     for(int j=0;j<txt.length();j++){ // 
     if(txt.charAt(j)=='A'|| txt.charAt(j)=='a'){
     countZanore++; 
     }
     }
     if(countZanore>=3){
     count++;
     }
     }
     return count;
 }
 } 

    

