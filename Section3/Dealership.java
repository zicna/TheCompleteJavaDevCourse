import java.util.Scanner;

public class Dealership{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership!");
        System.out.println(" - Select option a to buy a car");
        System.out.println(" - Select option b to sell a car");

        String option = scan.nextLine();

        switch(option){
            case "a": 
                System.out.println("What is your budget");
                int budget = scan.nextInt();
                if(budget >= 10000){
                    System.out.println("Great! Nissan Altima is avaiable!");
                    System.out.println("\n Do you have insurance? Write 'yes' or 'no'.");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\n Do you have driver licence? 'yes or 'no'?");
                    String licence = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && licence.equals("yes") && creditScore > 660){
                        System.out.println("\nSold, Pleasure doing business with you!");
                    }else{
                        System.out.println("We are sorry you are not eligible.");
                    }

                }else{
                    System.out.println("Sorry, We do not sell cars under 10000");
                }
            break;
            case "b": 
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if(value > price && price < 30000){
                    System.out.println("\nWe will buy your car! Pleasure doing business with you.");
                }else{
                    System.out.println("\nSorry, we're not interested!");
                }
            break;
            default: System.out.println("\nInalid option!");
        }

        scan.close();
    }
}