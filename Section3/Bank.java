import java.util.Scanner;

public class Bank{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\n**** ROYAL BANK of JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");

        String decision = scan.next();

        switch(decision){
            case "yes": System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();

            System.out.println("\nHow many years have you worked for?");
            int numOfYears = scan.nextInt();

            System.out.println("What is your name");
            String name = scan.next();

            if(savings >= 10000 && debt <= 5000 && numOfYears >= 2){
                System.out.println("Congratulations " + name + " You have been approved!");
            }else{
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
            break;
            case "no": System.out.println("\nOK. Have a nice day!");
            break;
            default: System.out.println("Not sure what do you think");
        }

    }
}