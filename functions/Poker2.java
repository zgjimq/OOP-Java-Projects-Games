package java2.functions;

import java.util.Scanner;

public class Poker2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("\t- There are two players, you and the computer.");
        System.out.println("\t- The dealer will give each player one card.");
        System.out.println("\t- Then, the dealer will draw five cards (the river)");
        System.out.println("\t- The player with the most river matches wins!");
        System.out.println("\t- If the matches are equal, everyone's a winnner!");
        System.out.println("\t- Ready? Type anything if you are.");
        String typeAnything=scan.nextLine();
        String myCard=card();
        String computerCard=card();
        System.out.println("Here's your card: \n"+myCard);
        System.out.println("\nHere's computer card: \n"+computerCard);
        int countMyCard=0;
        int countComputerCard=0;
        for(int i=0;i<6;i++){
            String drawCards=card();
            if(myCard.equals(drawCards)){
                countMyCard++;
            }
            if(computerCard.equals(drawCards)){
                countComputerCard++;
            }
        }
        System.out.println("Your number of matches: "+countMyCard);
        System.out.println("Computer number of matches: "+countComputerCard);

        if(countMyCard>countComputerCard){
          System.out.println("You have won!!");
        }else if(countMyCard<countComputerCard){
          System.out.println("Computer has won!");
        }
        else{
          System.out.println("No one has won!");
        }
        scan.close();
        System.out.println(typeAnything);

    }   
    public static String card(){
        double randomCard=Math.random()*13+1;
        int numri=(int)randomCard;
        String finalCard="";

        switch(numri){
            case 1:
                finalCard="   _____\n"+"  |A _  |\n"+  "  | ( ) |\n"+"  |(_'_)|\n"+ "  |  |  |\n"+ "  |____V|\n";
                   break;
                case 2:
                finalCard="   _____\n"+              "  |2    |\n"+ "  |  o  |\n"+"  |     |\n"+"  |  o  |\n"+"  |____Z|\n"; 
                    break;
                case 3:
                finalCard="   _____\n" +"  |3    |\n"+ "  | o o |\n"+"  |     |\n"+"  |  o  |\n"+"  |____E|\n";   
                  break;
                case 4:
                finalCard="   _____\n" + "  |4    |\n"+"  | o o |\n"+ "  |     |\n"+"  | o o |\n"+ "  |____h|\n";   
                  break; 
                case 5:
                finalCard= "   _____ \n" +"  |5    |\n" +"  | o o |\n" +"  |  o  |\n" +"  | o o |\n" +"  |____S|\n";   
                  break;   
                case 6:
                  finalCard= "   _____ \n" +"  |6    |\n" +"  | o o |\n" +"  | o o |\n" +"  | o o |\n" +"  |____6|\n";   
                  break;
                case 7:
                  finalCard= "   _____ \n" +"  |7    |\n" +"  | o o |\n" +"  |o o o|\n" +"  | o o |\n" +"  |____7|\n";   
                  break;
                case 8:
                  finalCard=  "   _____ \n" +"  |8    |\n" + "  |o o o|\n" +"  | o o |\n" +"  |o o o|\n" +"  |____8|\n";   
                  break;
                case 9:
                  finalCard=  "   _____ \n" +"  |9    |\n" +"  |o o o|\n" +"  |o o o|\n" +"  |o o o|\n" +"  |____9|\n";   
                  break;
                case 10:
                  finalCard="   _____ \n" +"  |10  o|\n" +"  |o o o|\n" +"  |o o o|\n" +"  |o o o|\n" +"  |___10|\n";   
                  break;
                case 11:
                  finalCard="   _____\n" +"  |J  ww|\n"+ "  | o {)|\n"+ "  |o o% |\n"+ "  | | % |\n"+ "  |__%%[|\n";
                    break;
                case 12:
                    finalCard= "   _____\n" +"  |Q  ww|\n"+ "  | o {(|\n"+ "  |o o%%|\n"+ "  | |%%%|\n"+ "  |_%%%O|\n";
                    break;
                case 13:
                finalCard="   _____\n" +"  |K  WW|\n"+ "  | o {)|\n"+ "  |o o%%|\n"+ "  | |%%%|\n"+  "  |_%%%>|\n"; 
                 break;   
        }

        return finalCard;
    }
}
