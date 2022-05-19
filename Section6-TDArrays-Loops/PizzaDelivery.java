import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int numberOfToppings = scan.nextInt();

        System.out.println("Great, enter each toping!");
        String[] toppings = new String[numberOfToppings];
        String top = "";
        for(int i = 0; i < numberOfToppings; i++){
            System.out.print((i+1) + ". ");
            top = scan.next();
            toppings[i] = top;
        }
        System.out.println("Thank you! Here are the toppings you orderd");
        System.out.println(Arrays.toString(toppings)); 


        scan.close();
    }
}