import java.util.Scanner;

public class Guess{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secret = (int)(Math.random() * 5 + 1);
        // System.out.println(secret);
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
        int yourGuess = scan.nextInt();

        while(secret != yourGuess){
            System.out.print("Guess again: ");
            yourGuess = scan.nextInt();
        }

        System.out.println("You got it!");



        scan.close();
    }
}