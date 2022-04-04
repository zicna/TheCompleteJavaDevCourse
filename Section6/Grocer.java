import java.util.Scanner;

public class Grocer{
    public static void main(String[] args) {
        String[] products = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        for(int i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to buy?");

        String askToBuy = scan.nextLine();

        // System.out.println("\nDo you sell " + askToBuy + "?");

        for(int i =0; i < products.length; i++){
            if(products[i].equals(askToBuy)){
                System.out.println("Yes, we sell " + askToBuy + ".");
                System.exit(0);
            }
        }

        System.out.println("Sorry we do not sell " + askToBuy);




    }
}