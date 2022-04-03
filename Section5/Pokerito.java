import java.util.Scanner;

public class Pokerito{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("• There are two players, you and the computer.");
        System.out.println("• The dealer will give each player one card.");
        System.out.println("• Then, the dealer will draw five cards (the river)");
        System.out.println("• The player with the most river matches wins!");
        System.out.println("• If the matches are equal, everyone's a winner!");
        System.out.println("• Ready? Type anything if you are.");
        scan.nextLine();
        
        System.out.println("'Here's your card:'");
        String usersCard = randomCard();
        System.out.println(usersCard);
        
        System.out.println("'Here's the computer's card:'");
        String computerCard = randomCard();
        System.out.println(computerCard);
        
        int yourMatches = 0;
        int computerMatches = 0;
        
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scan.nextLine();
        for(int i = 1; i < 6; i++){
            String river = randomCard();
            System.out.println("Card " + i + "\n" + river);
            if(usersCard.equals(river)){
                yourMatches++;
            }else if(computerCard.equals(river)){
                computerMatches++;
            }
        scan.nextLine();
        }
        
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if(yourMatches > computerMatches){
            System.out.println("You win!");
        }
        if(yourMatches == computerMatches){
            System.out.println("everyone wins");
        }
        if(computerMatches > yourMatches){
            System.out.println("Computer wins!");
        }


        scan.close();
        
    }

    public static String randomCard(){
        int randomNumber = (int)(Math.random() * 13 + 1);
        switch (randomNumber) {
            case 1:
            return  
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            case 2: 
            return 
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            case 3:
            return 
            "   _____\n" +
             "  |3    |\n"+
             "  | o o |\n"+
             "  |     |\n"+
             "  |  o  |\n"+
             "  |____E|\n";

            case 4:
            return 
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";

            case 5:
            return 
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";

            case 6:
            return 
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";

            case 7:
            return 
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";

            case 8:
            return 
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";

            case 9:
            return 
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";

            case 10:
            return 
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";

            case 11:
            return 
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";

            case 12:
            return 
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";

            case 13:
            return 
            "   _____\n" +
             "  |K  WW|\n"+ 
             "  | o {)|\n"+ 
             "  |o o%%|\n"+ 
             "  | |%%%|\n"+ 
             "  |_%%%>|\n";

            default: return "";
        }
    }
}