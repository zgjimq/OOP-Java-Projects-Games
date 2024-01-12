/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U8;

import java.util.Scanner;

/**
 *
 * @author Bruger
 */
public class NumeroNumrat {
    public static void main (String[]args){
    Scanner scan=new Scanner(System.in);
        System.out.println("Shtyp madhesin e vargut se paku 10");
        int madhesia=scan.nextInt();
        
        do{
        if(madhesia<10){
        System.out.println("Shtyp perseri madhesin e vargut se paku 10");
         madhesia=scan.nextInt();
        }
        }while(madhesia<10);
        scan.nextLine();
        String [] array = new String[madhesia];
        for(int i = 0;i<array.length;i++){
            System.out.println("Shtyp fjale fjali");
            array[i]=scan.nextLine();
        }
        int rez=numeroNumrat(array);
        System.out.println("Jane shtypur "+array.length+" fjale/fjali dhe "+rez+" prej tyre kishin vetem 2 numra");
    }
    // i ---> per elementet
    // j ---> per shkronjat
    public static int numeroNumrat(String[]a){ 
    int countTotali=0;
    for(int i=0;i<a.length;i++){ // elementin brenda ne varg
        int countNumrat=0;
        for(int j =0;j<a[i].length();j++){//cdo shkronje te elementit .. a[i].length()
        if(a[i].charAt(j)>='0' && a[i].charAt(j)<='9'){
        countNumrat++;
        }
        }
        if(countNumrat==2){
        countTotali++;
        }
    
    }
    return countTotali;
    }
}
