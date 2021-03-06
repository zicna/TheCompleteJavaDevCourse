import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        
        Item itemOne = new Item("Pepsi", 1.99, 3 );
        
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };
        
        Machine machineOne = new Machine(items);
        
        // * testing setters and getters
        // System.out.println(machineOne.getItem(2, 1));
        // Item item = machineOne.getItem(2, 1);
        // item.setPrice(2.99);
        // System.out.println(item);
        // machineOne.setItem(item, 2, 1);
        // System.out.println(machineOne.getItem(2, 1));
        
        // * testing dispence method
        machineOne.dispense(0, 0);
        machineOne.dispense(0, 0);
        System.out.println(machineOne.getItem(0, 0));
        
        
        System.out.println("***************************************************");
        System.out.println("\t WELCOME TO JAVA DRINKS!");
        System.out.println("***************************************************");
        
        while(true){
            System.out.println(machineOne); 
            System.out.print("Pick a row: ");
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row: "); 
            int spot = scan.nextInt();
            if(machineOne.dispense(row, spot)){
                System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
            }else{
                System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
            }
            if(scan.nextInt() != 1){
                break;
            }
        }

        
        // scan.close();
    }
}