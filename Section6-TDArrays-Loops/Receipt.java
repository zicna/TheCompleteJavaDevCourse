public class Receipt{
    public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {1.99, 1.49, 1.29};
        double total = 0;

        System.out.println("Here's your receipt:\n");
        for(int i =0; i < apples.length; i++){
            System.out.println(apples[i] + " : $" + prices[i]);
            total += prices[i];
        }
        System.out.println("-----------------------");
        System.out.println("Your total is: $" + total);
    }

}