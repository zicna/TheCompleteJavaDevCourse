import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;;

public class SignUp{
    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
    
            System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("What is your name?");
        String userFirstName = scan.nextLine();

        System.out.println("\nWhat is your last name?");
        String userLastName = scan.nextLine();

        System.out.println("\nHow old are you?");
        int userAge = scan.nextInt();

        scan.nextLine();
        System.out.println("\nWhat will be your username?");
        String userName = scan.nextLine();

        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        System.out.println("\nWhat country is that for?");
        String country = scan.nextLine();

        System.out.println("Here are your info:");

        System.out.println("\tFirst Name: " + userFirstName);
        System.out.println("\tLast Name: " + userLastName);
        System.out.println("\tAge: " + userAge);
        System.out.println("\tUsername: " + userName);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
        
        
        System.out.println("\nThank you for joining JavaGram!");
    
        scan.close();
    }
}