import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String play = scan.nextLine();

        switch(play){
            case "yes":
                System.out.println("Great!");
                System.out.println("rock - paper - scissors, shoot");
            
                String userChoice = scan.nextLine();
                String randomChoice = randomChoice();

                System.out.println("You pick: " + userChoice + " computer choose " + randomChoice+ "." );

                // boolean userWon = compare(userChoice, randomChoice);
                // printStatement(userWon);
                printStatement(compare(userChoice, randomChoice));


            break;
            case "no" :
                System.out.println("Sorry, see you next time");
                System.exit(0);
            default: 
                System.out.println("wrong input");
        }
        scan.close();
    }

    public static String randomChoice(){
        double randomNum = Math.random() * 3 +1;
        //  if((int)num == 1){
        //      return "rock";
        //  }else if((int)num == 2){
        //      return "paper";
        //  }else{
        //      return "scissors";
        //  }

        switch((int)randomNum){
            case 1: return "rock";
            case 2 : return "paper";
            case 3: return "scissors";
            default: return "";
        }
    }

    public static boolean compare(String userChoice, String randomChoice){
        if(userChoice.equals(randomChoice)){
            System.out.println("No winners");
            System.exit(0);
        }
        if((userChoice.equals("rock") && randomChoice.equals("scissors")) || (userChoice.equals("scissors") && randomChoice.equals("paper")) || (userChoice.equals("paper") && randomChoice.equals("rock")) ){
            return true;
        }
        return false;
    }

    public static void printStatement(boolean userWon){
        if(userWon){
            System.out.println("You won");
        }else{
         System.out.println("Sorry, I lose!");
        }
    }
}