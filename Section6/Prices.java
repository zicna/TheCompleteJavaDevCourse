public class Prices{
    public static void main(String[] args) {
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        for(int i =0; i < prices.length; i++){
            if(i == 0){
                System.out.print("Baking: ");
            }else if(i == 1){
                System.out.print("Beverage: ");
            }else{
                System.out.print("Cereals: ");
            }
            for(int j = 0; j < prices[i].length; j++){
                System.out.print(prices[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}