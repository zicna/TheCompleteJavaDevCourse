import java.util.Scanner;

public class Blackjack{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        // *Users draw cards
        int userRandOne = drawRandomCard();
        int userRandTwo = drawRandomCard();

        String userCardOne = cardString(userRandOne);
        String userCardTwo = cardString(userRandTwo);

        System.out.println("\n You get a \n" + userCardOne + "\n and a \n" + userCardTwo);

        int userTotal = Math.min(userRandOne, 10) + Math.min(userRandTwo,10);
        System.out.println("Your total is: " + userTotal);

        // * Dealers cards draw

        int dealerRandOne = drawRandomCard();
        int dealerRandTwo = drawRandomCard();
        String dealerCardOne = cardString(dealerRandOne);
        String dealerCardTwo = cardString(dealerRandTwo);
        int dealerTotal = Math.min(dealerRandOne,10) + Math.min(dealerRandTwo, 10);

        System.out.println("\n The dealer shows  \n" + dealerCardOne + "\nand has a card facing down \n" + faceDown());
        System.out.println("\nThe dealer's total is hidden");

        
        while(true){
            String play = hitOrStay();
           if(play.equals("stay")){
               break;
           }
            int userRand = drawRandomCard();
            String userCard = cardString(userRand);
            userTotal += Math.min(userRand, 10);
            System.out.println("\n You get a \n " + userCard);
            System.out.println("Your new total is " + userTotal);

            if(userTotal > 21){
                System.out.println("You go bust!. You lose!");
                System.exit(0);
            }
        }
        System.out.println("\nDealer's turn");
        System.out.println("\n Dealer hidden card was:\n" + dealerCardTwo);
        System.out.println("Dealer total is " + dealerTotal);

        while(dealerTotal < 17){
            
            int dealerRand = drawRandomCard();
            String dealerCard = cardString(dealerRand);

            System.out.println("\n Dealer get a \n " + dealerCard);
            dealerTotal += Math.min(dealerRand, 10);
            System.out.println("Dealer total is " + dealerTotal);
        }


        if(dealerTotal > 21 || userTotal > dealerTotal){
            System.out.println("You win!");
        }else if(dealerTotal > userTotal){
            System.out.println("You lose!");
        }else{
            System.out.println("No winner");
        }
        scan.close();
    }

    public static String hitOrStay(){
        System.out.println("Do you want to 'hit' or 'stay'?");
        String decision = scan.nextLine();
        while(!(decision.equals("hit") || decision.equals("stay"))){
            System.out.println("Please write 'hit' or 'stay'. ");
            decision = scan.nextLine();
        }
        return decision;

    }

    public static int drawRandomCard(){
        return (int)(Math.random() * 13 + 1);
        
    }

    public static String cardString(int cardNumber){
        switch (cardNumber) {
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

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
}