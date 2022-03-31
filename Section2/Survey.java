import java.util.Scanner;

public class Survey{

    public static void main(String[] args) {

        int counter = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome. Thank you for taking the survey.");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;


        System.out.println("\nHow much mony do you spend on fastfood");
        double foodPrice = scan.nextDouble();
        counter++;


        System.out.println("\nHow many time a week do you buy coffee");
        int coffeeAmount = scan.nextInt();
        counter++;


        System.out.println("\nHow many time a week do you buy fastfood");
        int fastFoodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + ", for answering all " + counter + " questions.");
        System.out.println("Your fastfood expenses are " +(int)(foodPrice/coffeePrice)+ " times your coffee expenses.");
        System.out.println("\nweekly you spend $" +(coffeeAmount*coffeePrice)+ " on coffee.");
        System.out.println("weekly you spend $" +(fastFoodAmount*foodPrice)+ " on coffee.");



        scan.close();


    }

}