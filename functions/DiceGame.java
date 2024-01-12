package java2.functions;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    
    public static void main(String[] args) {
        System.out.println("Pick an number beetween 1-6");
        Scanner scan= new Scanner(System.in);
        System.out.println("First number :");
        int nr1=scan.nextInt();
        System.out.println("Second number :");
        int nr2=scan.nextInt();
        System.out.println("Last number :");
        int nr3=scan.nextInt();
        scan.close();
        int countDice=Count(nr1, nr2, nr3);
        if( (nr1<=0 || nr2<=0 || nr3<=0) && (nr1<6 || nr2<6 || nr3<6) ){
            System.out.println("Keni shtypur gabim");
        }else{
            Random random= new Random();
            int ran= random.nextInt(7);
            int ran2= random.nextInt(7);
            int ran3= random.nextInt(7);
            int countDiceRandom=Count(ran, ran2, ran3);
            
            if(countDice>=countDiceRandom && countDice-countDiceRandom <3){
                System.out.println(countDice +" : "+countDiceRandom);
                System.out.println("U have you wonnnn!!!!");
            }
            else{
                System.out.println(countDice +" : "+countDiceRandom);
                System.out.println("U have lost, better luck next time!");
            }
        }
    }
    public static int Count(int nr1,int nr2,int nr3){
        return nr1+nr2+nr3;
    }
}
