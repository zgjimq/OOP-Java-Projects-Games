package java2.functions;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("When i say 'shoot', Choose:Rock, Paper, Scissors");
        System.out.println("Are you ready? (Write 'y' for yes and 'n' for no)");
        String yesNo=scan.nextLine();

            while(!yesNo.equals("y") && !yesNo.equals("n")){
                System.out.println("Re enter again 'y' or 'n'");
                yesNo=scan.nextLine();
            } 

        if(yesNo.equals("y")){
            System.out.println("Greate! Rock - Paper - Scissors, shoot :");
            String urOpsion=scan.nextLine();
            while(!urOpsion.equals("Rock") && !urOpsion.equals("Paper") && !urOpsion.equals("Scissors")){
                System.out.println("Re enter again Rock Paper or Scissors");
                urOpsion=scan.nextLine();
            } 
            String computerOpsion=Chosser();

            int bet = Betters(urOpsion, computerOpsion);
            if(bet==0){
                System.out.println("U have a tied game!");
            }
            else if(bet == 1){
                System.out.println("You have lost better luck next time!!");
                System.out.println("You have chossen :"+urOpsion+"\nAnd computer has chossen :"+computerOpsion);
            }
            else{
                System.out.println("You have chossen :"+urOpsion+"\nAnd computer has chossen :"+computerOpsion);
                System.out.println("Good job you have won the game!!!!!!!!");                    
            }
        }
        else{
            System.out.println("Darn, some other time....");
        }
        scan.close();
    }



    public static String Chosser(){
        Random random = new Random();
        int ranOps=random.nextInt(3);
            String ranOpsion;
            if(ranOps==0){
                ranOpsion="Rock";
            }else if(ranOps==1){
                ranOpsion="Paper";
            }
            else{
                ranOpsion="Scissors";
            }
        return ranOpsion;
    }
    public static int Betters(String urOpsion,String computerOpsion){
        int index=0;// 0-tie   1-lose   2-win
        if(urOpsion.equals(computerOpsion)){
            index=0;
        }
        else if(urOpsion.equals("Rock") && computerOpsion.equals("Paper")){
            index=1;
        }
        else if(urOpsion.equals("Rock") && computerOpsion.equals("Scissors")){
            index=2;
        }
        else if(urOpsion.equals("Paper") && computerOpsion.equals("Rock")){
            index=2;
        }
        else if(urOpsion.equals("Paper") && computerOpsion.equals("Scissors")){
            index=1;
        }
        else if(urOpsion.equals("Scissors") && computerOpsion.equals("Rock")){
            index=1;
        }
         else if(urOpsion.equals("Scissors") && computerOpsion.equals("Paper")){
            index=2;
        }
        return index;
    }
}