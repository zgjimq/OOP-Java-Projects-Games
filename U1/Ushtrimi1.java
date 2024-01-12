/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U1;

/**
 *
 * @author Bruger
 */
public class Ushtrimi1 {
    public static void main (String[]args){
    int a;
    for (a=1;a<=100;a++)
    if (a %2==0)
            System.out.println( a+" ");
    
        System.out.println("==========================");
    for (int i=1;i<=100;i++)
        if(i%2==1)
            System.out.println( i+" ");
        System.out.println("=============================");
    // numrat cift dhe tek
    for (int k = 100;k >=1;k--){
        if(k%2==0)
            System.out.println( k+" ");
            
            }
    for (int k1 = 100 ; k1 >=1;k1--)
        if(k1%2==1)
            System.out.println(k1+ " ");
        System.out.println("===============================");
    // numrat chift dhe tek prej 100 teposht
    // mund me u perdor edhe cift ndryshimi k -=2 , qe do na jep si prsh..
    for(int k2 = 100 ; k2>=1;k2-=2)
       System.out.println(k2+" ");
   // njejt mund te perdoret edhe me numerin tek veq se duhet te me 99 [k2-=2]
        System.out.println("================================");
   int z=1;
   while(z<=100){
   if (z%2==0)
           System.out.print(z+" ");
   z++;
   }
        
        int z1=100;
        while(z1>=1){
            if(z1%2==1)
                System.out.println(z1+" ");
        z1--;
        }
    }
    
}
