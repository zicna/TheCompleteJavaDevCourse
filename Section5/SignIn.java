import java.util.Scanner;

public class SignIn{
    public static void main(String[] args) {

        String username = "Samantha";
        String password = "Samantha";

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.println("- Username: ");
        String usernamePick = scan.nextLine();

        System.out.println("- Password: ");
        String passwordPick = scan.nextLine();

        while(!username.equals(usernamePick) || !password.equals(passwordPick)){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.println("- Username: ");
            scan.nextLine();
            usernamePick = scan.nextLine();
            System.out.println("- Password: ");
            scan.nextLine();
            passwordPick = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!");



        scan.close();


        
    }
}