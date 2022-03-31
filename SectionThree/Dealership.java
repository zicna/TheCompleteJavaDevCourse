import java.util.Scanner;

public class Dealership{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership!");
        System.out.println(" - Select option a to buy a car");
        System.out.println(" - Select option b to buy a car");

        String option = scan.nextLine();

        switch(option){
            case "a": System.out.println("you chose option " + option);
            break;
            case "b": System.out.println("you chose option " + option);
            break;
            default: System.out.println("Inalid option!");
        }

        scan.close();
    }
}