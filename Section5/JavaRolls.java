import java.util.Scanner;

public class JavaRolls{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great, here are the rules:\n\t- If you roll a 6 the game stops.\n\t- If you roll a 4 nothing happens.\n\t- Otherwise, you get 1 point.\nYou must collect at least 3 points to win. Enter anything to roll:");

        int score = 0;

        while(true){
            scan.nextLine();
            
            int roll = rollDice();
            if(roll == 4){
                System.out.print("Zero points. Keep rolling.");
                continue;
            }else if(roll == 6){
                System.out.print("End of game");
                break;
            }else{
                System.out.print("One point. Keep rolling.");
                score++;
            }
        }

        System.out.println("\n Your score is : " + score);
        if(score >= 3){
            System.out.println("Wow, that's lucky. You win!");
        }else {
            System.out.println("Tough luck, you lose :(");
        }


        scan.close();
    }

    public static int rollDice(){
        int roll = (int)(Math.random() * 6 + 1);
        System.out.print("You rolled a " + roll + ". ");
        return roll;
    }
}